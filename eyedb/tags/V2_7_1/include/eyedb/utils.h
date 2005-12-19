
/*
 * File 'utils.h'
 *
 * Package Name 'utils'
 *
 * Generated by eyedbodl at Thu Dec  8 15:48:28 2005
 *
 * -------------------------------------
 * ------- DO NOT EDIT THIS CODE -------
 * -------------------------------------
 *
 */

#include <eyedb/eyedb.h>

#ifndef _eyedb_utils_
#define _eyedb_utils_

using namespace eyedb;

namespace eyedb {

class Image;
class URL;
class WConfig;
class Date;
class Time;
class TimeStamp;
class TimeInterval;
class OString;

class utils {

 public:
  static void init();
  static void release();
  static Status updateSchema(Database *db);
  static Status updateSchema(Schema *m);
};

class utilsDatabase : public Database {

 public:
  utilsDatabase(const char *s, const char *_dbmdb_str = 0) : Database(s, _dbmdb_str) {}
  utilsDatabase(const char *s, int _dbid, const char *_dbmdb_str = 0) : Database(s, _dbid, _dbmdb_str) {}
  utilsDatabase(int _dbid, const char *_dbmdb_str = 0) : Database(_dbid, _dbmdb_str) {}
  Status open(Connection *, Database::OpenFlag, const char * = 0, const char * = 0);
  Status open(Connection *, Database::OpenFlag, const OpenHints *hints, const char * = 0, const char * = 0);
  static void setConsApp(Database *);
  static Status checkSchema(Schema *);
  static Bool getDynamicGetErrorPolicy();
  static Bool getDynamicSetErrorPolicy();
  static void setDynamicGetErrorPolicy(Bool policy);
  static void setDynamicSetErrorPolicy(Bool policy);
};

class ImageType {

public:
  enum Type {
    GIF_IMG_TYPE = 1,
    JPEG_IMG_TYPE = 2,
    PM_IMG_TYPE = 3,
    PBM_IMG_TYPE = 4,
    X11BITMAP_IMG_TYPE = 5,
    BMP_IMG_TYPE = 6,
    TIFF_IMG_TYPE = 7
  };
};

class Month {

public:
  enum Type {
    January = 1,
    February = 2,
    March = 3,
    April = 4,
    May = 5,
    June = 6,
    July = 7,
    August = 8,
    September = 9,
    October = 10,
    November = 11,
    December = 12
  };
};

class Weekday {

public:
  enum Type {
    Sunday = 0,
    Monday = 1,
    Tuesday = 2,
    Wednesday = 3,
    Thursday = 4,
    Friday = 5,
    Saturday = 6
  };
};

class Image : public Struct {

 public:
  Image(Database * = 0, const Dataspace * = 0);
  Image(const Image& x);

  virtual Object *clone() const {return new Image(*this);};

  Image& operator=(const Image& x);

  virtual Image *asImage() {return this;}
  virtual const Image *asImage() const {return this;}

  Status setName(const char *);
  Status setName(unsigned int a0, char);
  const char *getName(Bool *isnull = 0, Status * = 0) const;
  char getName(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;

  Status setType(ImageType::Type, Bool _check_value = True);
  ImageType::Type getType(Bool *isnull = 0, Status * = 0)  const;

  Status setData(const unsigned char *, unsigned int len);
  Status setData(unsigned int a0, unsigned char);
  Status setDataCount(unsigned int a0);
  const unsigned char *getData(unsigned int *len, Bool *isnull = 0, Status * = 0) const;
  unsigned char getData(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;
  unsigned int getDataCount(Status * = 0) const;

  Status setW(eyedblib::int32);
  eyedblib::int32 getW(Bool *isnull = 0, Status * = 0)  const;

  Status setH(eyedblib::int32);
  eyedblib::int32 getH(Bool *isnull = 0, Status * = 0)  const;
  virtual ~Image() {garbageRealize();}

 protected:
  Image(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  Image(const Struct *x, Bool share, int) : Struct(x, share) {}
  Image(const Image *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  Image(const Struct *, Bool = False);
  Image(const Image *, Bool = False);
  Image(const Class *, Data);
};

class URL : public Struct {

 public:
  URL(Database * = 0, const Dataspace * = 0);
  URL(const URL& x);

  virtual Object *clone() const {return new URL(*this);};

  URL& operator=(const URL& x);

  virtual URL *asURL() {return this;}
  virtual const URL *asURL() const {return this;}

  Status setProto(const char *);
  Status setProto(unsigned int a0, char);
  const char *getProto(Bool *isnull = 0, Status * = 0) const;
  char getProto(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;

  Status setUrl(const char *);
  Status setUrl(unsigned int a0, char);
  const char *getUrl(Bool *isnull = 0, Status * = 0) const;
  char getUrl(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;
  virtual ~URL() {garbageRealize();}
  // URL User Part

  URL(const char *proto, const char *url);
  

 protected:
  URL(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  URL(const Struct *x, Bool share, int) : Struct(x, share) {}
  URL(const URL *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  URL(const Struct *, Bool = False);
  URL(const URL *, Bool = False);
  URL(const Class *, Data);
};

class WConfig : public Struct {

 public:
  WConfig(Database * = 0, const Dataspace * = 0);
  WConfig(const WConfig& x);

  virtual Object *clone() const {return new WConfig(*this);};

  WConfig& operator=(const WConfig& x);

  virtual WConfig *asWConfig() {return this;}
  virtual const WConfig *asWConfig() const {return this;}

  Status setName(const char *);
  Status setName(unsigned int a0, char);
  const char *getName(Bool *isnull = 0, Status * = 0) const;
  char getName(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;

  Status setUser(const char *);
  Status setUser(unsigned int a0, char);
  const char *getUser(Bool *isnull = 0, Status * = 0) const;
  char getUser(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;

  Status setConf(const char *);
  Status setConf(unsigned int a0, char);
  const char *getConf(Bool *isnull = 0, Status * = 0) const;
  char getConf(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;
  virtual ~WConfig() {garbageRealize();}

 protected:
  WConfig(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  WConfig(const Struct *x, Bool share, int) : Struct(x, share) {}
  WConfig(const WConfig *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  WConfig(const Struct *, Bool = False);
  WConfig(const WConfig *, Bool = False);
  WConfig(const Class *, Data);
};

class Date : public Struct {

 public:
  Date(Database * = 0, const Dataspace * = 0);
  Date(const Date& x);

  virtual Object *clone() const {return new Date(*this);};

  Date& operator=(const Date& x);

  virtual Date *asDate() {return this;}
  virtual const Date *asDate() const {return this;}

  Status setJulian(eyedblib::int32);
  eyedblib::int32 getJulian(Bool *isnull = 0, Status * = 0)  const;
  virtual ~Date() {garbageRealize();}
  // Date User Part

  private:
    char string_date[16];

    virtual void userCopy(const Object &);
    virtual void userInitialize();
    void setClientData();

  public:
    static Date * date(Database * db);
    static Date * date(Database * db, const Date & d);
    static Date * date(Database * db, eyedblib::int32 julian_day);
    static Date * date(Database * db, eyedblib::int32 year, Month::Type m, eyedblib::int16 day);
    static Date * date(Database * db, const char * d);
    static eyedblib::int32 julian(const char * d);
    eyedblib::int32 year() const;
    eyedblib::int16 month() const;
    eyedblib::int16 day() const;
    eyedblib::int16 day_of_year() const;
    Month::Type month_of_year() const;
    Weekday::Type day_of_week() const;
    const char * toString() const;
    Bool is_leap_year() const;
    Bool is_equal(const Date & d) const;
    Bool is_greater(const Date & d) const;
    Bool is_greater_or_equal(const Date & d) const;
    Bool is_less(const Date & d) const;
    Bool is_less_or_equal(const Date & d) const;
    Bool is_between(const Date & d1, const Date & d2) const;
    Date & next(Weekday::Type day);
    Date & previous(Weekday::Type day);
    Date & add_days(eyedblib::int32 days);
    Date & substract_days(eyedblib::int32 days);
    eyedblib::int32 substract_date(const Date & d) const;
    Status set_julian(eyedblib::int32 julian_day);
    

 protected:
  Date(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  Date(const Struct *x, Bool share, int) : Struct(x, share) {}
  Date(const Date *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  Date(const Struct *, Bool = False);
  Date(const Date *, Bool = False);
  Date(const Class *, Data);
};

class Time : public Struct {

 public:
  Time(Database * = 0, const Dataspace * = 0);
  Time(const Time& x);

  virtual Object *clone() const {return new Time(*this);};

  Time& operator=(const Time& x);

  virtual Time *asTime() {return this;}
  virtual const Time *asTime() const {return this;}

  Status setUsecs(eyedblib::int64);
  eyedblib::int64 getUsecs(Bool *isnull = 0, Status * = 0)  const;

  Status setTz(eyedblib::int16);
  eyedblib::int16 getTz(Bool *isnull = 0, Status * = 0)  const;
  virtual ~Time() {garbageRealize();}
  // Time User Part

  private:
    char string_time[48];

    virtual void userCopy(const Object &);
    virtual void userInitialize();
    void setClientData();
  public:

  Status set_usecs(eyedblib::int64 usecs, eyedblib::int16 tz);
  static void get_local_time_zone(eyedblib::int16 * tz_hour, eyedblib::int16 * tz_min);
  static Time * gmt_time(Database * db);
  static Time * local_time(Database * db);
  static Time * time(Database * db, const Time & t);
  static Time * time(Database * db, eyedblib::int64 usec);
  static Time * time(Database * db, eyedblib::int64 usec, eyedblib::int16 tz);
  static Time * time(Database * db, eyedblib::int16 hours, eyedblib::int16 min, eyedblib::int16 sec, eyedblib::int16 msec);
  static Time * time(Database * db, eyedblib::int16 hours, eyedblib::int16 min, eyedblib::int16 sec, eyedblib::int16 msec, eyedblib::int16 usec);
  static Time * time(Database * db, eyedblib::int16 hours, eyedblib::int16 min, eyedblib::int16 sec, eyedblib::int16 msec, eyedblib::int16 tz_hour, eyedblib::int16 tz_minute);
  static Time * time(Database * db, eyedblib::int16 hours, eyedblib::int16 min, eyedblib::int16 sec, eyedblib::int16 msec, eyedblib::int16 usec, eyedblib::int16 tz_hour, eyedblib::int16 tz_minute);
  static Time * time(Database * db, const char * t);
  static eyedblib::int64 usec_time(const char * t);
  eyedblib::int16 hour() const;
  eyedblib::int16 minute() const;
  eyedblib::int16 second() const;
  eyedblib::int16 millisecond() const;
  eyedblib::int16 tz_hour() const;
  eyedblib::int16 tz_minute() const;
  const char * toString() const;
  Bool is_equal(const Time & t) const;
  Bool is_greater(const Time & t) const;
  Bool is_greater_or_equal(const Time & t) const;
  Bool is_less(const Time & t) const;
  Bool is_less_or_equal(const Time & t) const;
  Bool is_between(const Time & t1, const Time &t2) const;
  Time & add_interval(const TimeInterval & i);
  Time & substract_interval(const TimeInterval & i);
  TimeInterval * substract_time(const Time & t);
  eyedblib::int16 gmt_hour() const;
  eyedblib::int16 gmt_minute() const;
  eyedblib::int16 microsecond() const;
  

 protected:
  Time(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  Time(const Struct *x, Bool share, int) : Struct(x, share) {}
  Time(const Time *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  Time(const Struct *, Bool = False);
  Time(const Time *, Bool = False);
  Time(const Class *, Data);
};

class TimeStamp : public Struct {

 public:
  TimeStamp(Database * = 0, const Dataspace * = 0);
  TimeStamp(const TimeStamp& x);

  virtual Object *clone() const {return new TimeStamp(*this);};

  TimeStamp& operator=(const TimeStamp& x);

  virtual TimeStamp *asTimeStamp() {return this;}
  virtual const TimeStamp *asTimeStamp() const {return this;}

  Status setUsecs(eyedblib::int64);
  eyedblib::int64 getUsecs(Bool *isnull = 0, Status * = 0)  const;

  Status setTz(eyedblib::int16);
  eyedblib::int16 getTz(Bool *isnull = 0, Status * = 0)  const;
  virtual ~TimeStamp() {garbageRealize();}
  // TimeStamp User Part

 private:
  Time ts_time;
  Date ts_date;
  char string_time_stamp[64];

  virtual void userCopy(const Object &);
  virtual void userInitialize();
  void setClientData();
 public:
  static TimeStamp * gmt_time_stamp(Database * db);
  static TimeStamp * local_time_stamp(Database * db);
  static TimeStamp * time_stamp(Database * db, const TimeStamp &);
  static TimeStamp * time_stamp(Database * db, eyedblib::int64 usec);
  static TimeStamp * time_stamp(Database * db, eyedblib::int64 usec, eyedblib::int16 tz);
  static TimeStamp * time_stamp(Database * db, eyedblib::int32 julian_day, eyedblib::int64 usec);
  static TimeStamp * time_stamp(Database * db, eyedblib::int32 julian_day, eyedblib::int64 usec, eyedblib::int16 tz);
  static TimeStamp * time_stamp(Database * db, const Date & d, const Time & t);
  static TimeStamp * time_stamp(Database * db, const Date & d);
  static TimeStamp * time_stamp(Database * db, const Date & d, eyedblib::int16 tz_hour, eyedblib::int16 tz_min);
  static TimeStamp * time_stamp(Database * db, const char * t);
  static eyedblib::int64 usec_time_stamp(const char * ts);
  const Date & date() const;
  const Time & time() const;
  eyedblib::int32 year() const;
  eyedblib::int16 month() const;
  eyedblib::int16 day() const;
  eyedblib::int16 hour() const;
  eyedblib::int16 minute() const;
  eyedblib::int16 second() const;
  eyedblib::int16 millisecond() const;
  eyedblib::int16 tz_hour() const;
  eyedblib::int16 tz_minute() const;
  const char * toString() const;
  TimeStamp & plus(const TimeInterval & i);
  TimeStamp & minus(const TimeInterval & i);
  Bool is_equal(const TimeStamp & ts) const;
  Bool is_greater(const TimeStamp & ts) const;
  Bool is_greater_or_equal(const TimeStamp & ts) const;
  Bool is_less(const TimeStamp & ts) const;
  Bool is_less_or_equal(const TimeStamp & ts) const;
  Bool is_between(const TimeStamp & ts1, const TimeStamp & ts2) const;
  eyedblib::int16 gmt_hour() const;
  eyedblib::int16 gmt_minute() const;
  eyedblib::int16 microsecond() const;
  Status set_usecs(eyedblib::int64 usec, eyedblib::int16 tz);
  TimeInterval * substract(const TimeStamp & ts);
  

 protected:
  TimeStamp(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  TimeStamp(const Struct *x, Bool share, int) : Struct(x, share) {}
  TimeStamp(const TimeStamp *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  TimeStamp(const Struct *, Bool = False);
  TimeStamp(const TimeStamp *, Bool = False);
  TimeStamp(const Class *, Data);
};

class TimeInterval : public Struct {

 public:
  TimeInterval(Database * = 0, const Dataspace * = 0);
  TimeInterval(const TimeInterval& x);

  virtual Object *clone() const {return new TimeInterval(*this);};

  TimeInterval& operator=(const TimeInterval& x);

  virtual TimeInterval *asTimeInterval() {return this;}
  virtual const TimeInterval *asTimeInterval() const {return this;}

  Status setUsecs(eyedblib::int64);
  eyedblib::int64 getUsecs(Bool *isnull = 0, Status * = 0)  const;
  virtual ~TimeInterval() {garbageRealize();}
  // TimeInterval User Part

  private:
    char string_time_interval[32];

    virtual void userCopy(const Object &);
    virtual void userInitialize();
    void setClientData();
  public:

  static TimeInterval * time_interval(Database *, eyedblib::int64 usecs);
  static TimeInterval * time_interval(Database *, eyedblib::int32 day, eyedblib::int16 hours, eyedblib::int16 min, eyedblib::int16 sec, eyedblib::int16 msec, eyedblib::int16 usec);
  eyedblib::int32 day() const;
  eyedblib::int16 hour() const;
  eyedblib::int16 minute() const;
  eyedblib::int16 second() const;
  eyedblib::int16 millisecond() const;
  eyedblib::int16 microsecond() const;
  Bool is_zero() const;
  const char * toString() const;
  TimeInterval & plus(const TimeInterval & i);
  TimeInterval & minus(const TimeInterval & i);
  TimeInterval & product(eyedblib::int64 val);
  TimeInterval & quotient(eyedblib::int64 val);
  Bool is_equal(const TimeInterval & i) const;
  Bool is_greater(const TimeInterval & i) const;
  Bool is_greater_or_equal(const TimeInterval & i) const;
  Bool is_less(const TimeInterval & i) const;
  Bool is_less_or_equal(const TimeInterval & i) const;
  Status set_usecs(eyedblib::int64 usecs);
  

 protected:
  TimeInterval(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  TimeInterval(const Struct *x, Bool share, int) : Struct(x, share) {}
  TimeInterval(const TimeInterval *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  TimeInterval(const Struct *, Bool = False);
  TimeInterval(const TimeInterval *, Bool = False);
  TimeInterval(const Class *, Data);
};

class OString : public Struct {

 public:
  OString(Database * = 0, const Dataspace * = 0);
  OString(const OString& x);

  virtual Object *clone() const {return new OString(*this);};

  OString& operator=(const OString& x);

  virtual OString *asOString() {return this;}
  virtual const OString *asOString() const {return this;}

  Status setS(const char *);
  Status setS(unsigned int a0, char);
  const char *getS(Bool *isnull = 0, Status * = 0) const;
  char getS(unsigned int a0, Bool *isnull = 0, Status * = 0)  const;
  virtual ~OString() {garbageRealize();}
  // OString User Part

    static OString * ostring(Database * db);
    static OString * ostring(Database * db, const char * s);
    static OString * ostring(Database * db, const char * s, int len);
    static OString * ostring(Database * db, const char * s, int offset, int len);
    static OString * ostring(Database * db, const OString & s);
    static OString * ostring(Database * db, char s);
    static OString * ostring(Database * db, int s);
    static OString * ostring(Database * db, double s);
    static OString * concat(Database * db, const char * s1, const char * s2);





    static char * substr(const char *, int offset, int len);
    static char * toLower(const char *);
    static char * toUpper(const char *);
    static char * rtrim(const char *);
    static char * ltrim(const char *);

    Status setChar(char c, int offset);
    char getChar(int offset) const;

    OString & append(const char * s);
    OString & append(const char * s, int len);
    OString & append(const char * s, int offset, int len);
    OString & prepend(const char * s);
    OString & prepend(const char * s, int len);
    OString & prepend(const char * s, int offset, int len);
    OString & insert(int offset, const char *);
    OString & insert(int offset, const char *, int len);
    OString & insert(int offset, const char *, int offset2, int len);

    int first(const char *) const;
    int last(const char *) const;
    int find(const char *, int offset) const;
    OString * substr(int offset, int len) const;
    OString * substr(const char * regexp, int offset) const;

    OString & erase(int offset, int len);
    OString & replace(int offset, int len, const char *);
    OString & replace(int offset, int len, const char *, int len2);
    OString & replace(int offset, int len, const char *, int offset2, int len2);
    OString & replace(const char * s1, const char * s2);
    OString & assign(const char *);
    OString & assign(const char *, int len);
    OString & assign(const char *, int offset, int len);
    Status reset();


    OString & toLower();
    OString & toUpper();

    OString & rtrim();
    OString & ltrim();

    int compare(const char *) const;
    int compare(const char *, int to) const;
    int compare(const char *, int from, int to) const;
    Bool is_null() const;
    Bool match(const char * regexp) const;

    int length() const;
    char ** split(const char * separator, int & nb_pieces) const;
    char ** regexp_split(const char * regexp_separator, int & nb_pieces) const;
    

 protected:
  OString(Database *_db, const Dataspace *_dataspace, int) : Struct(_db, _dataspace) {}
  OString(const Struct *x, Bool share, int) : Struct(x, share) {}
  OString(const OString *x, Bool share, int) : Struct(x, share) {}

 private:
  void initialize(Database *_db);

 public: /* restricted */
  OString(const Struct *, Bool = False);
  OString(const OString *, Bool = False);
  OString(const Class *, Data);
};


#define Image_(X) ((Image *)(X))

#define URL_(X) ((URL *)(X))

#define WConfig_(X) ((WConfig *)(X))

#define Date_(X) ((Date *)(X))

#define Time_(X) ((Time *)(X))

#define TimeStamp_(X) ((TimeStamp *)(X))

#define TimeInterval_(X) ((TimeInterval *)(X))

#define OString_(X) ((OString *)(X))

extern Object *utilsMakeObject(Object *, Bool=True);
extern Bool utils_set_oid_check(Bool);
extern Bool utils_get_oid_check();

extern EnumClass *ImageType_Class;
extern EnumClass *Month_Class;
extern EnumClass *Weekday_Class;
extern StructClass *Image_Class;
extern StructClass *URL_Class;
extern StructClass *WConfig_Class;
extern StructClass *Date_Class;
extern StructClass *Time_Class;
extern StructClass *TimeStamp_Class;
extern StructClass *TimeInterval_Class;
extern StructClass *OString_Class;

}

#endif