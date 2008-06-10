import pexpect
import sys
import os
import re
import subprocess

def run_simple_command( cmd, expected_status = 0, do_exit = True):
    if type(cmd) == str:
        cmd_list = cmd.split(' ')
    else:
        cmd_list = cmd
    p = subprocess.Popen( cmd_list)
    status = p.wait()
    if do_exit and status != expected_status:
        sys.exit( status)
    return status

def run_command_2( command, expected_output = None, expected_status = 0, do_exit = True):
    child = pexpect.spawn(command, env = os.environ)
    child.logfile = sys.stdout
    if expected_output is not None:
        for o in expected_output:
            child.expect(o)
    child.expect(pexpect.EOF)
    child.wait()
    child.close()
    if do_exit and child.exitstatus != expected_status:
        sys.exit( child.exitstatus)
    return child.exitstatus

def run_command_1( command, expected_status = 0, do_exit = True):
    print "running command \"%s\"" % (command,)
    (command_output, exitstatus) = pexpect.run( command, withexitstatus = True, logfile = sys.stdout, env = os.environ)
    if do_exit and exitstatus != expected_status:
        sys.exit( exitstatus)
    return exitstatus

def run_java_command( java_class, java=None, args=None, classpath=[]):
    classpath.append( "%s/src/java/eyedb.jar" % (os.environ['top_builddir'],) )
    if java is None:
        java = os.environ['JAVA']
    java_command = "%s -cp %s %s --user=%s %s" % (java, ':'.join( classpath), java_class, os.environ['USER'], args)
    print java_command
    run_simple_command( java_command)
