#!/usr/bin/env python
import pexpect
import sys

child = pexpect.spawn('eyedbadmin2 user delete')
index = child.expect(['eyedbadmin user delete \[--help\] <user>', pexpect.EOF])
if index == 1:
    sys.exit(255)
child.close()
if child.exitstatus == 1:
    sys.exit(0)
sys.exit(child.exitstatus)