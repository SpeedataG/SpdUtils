##### 添加一些配置文件
```
// 在工程根 build.gradle:
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.3.3'
        // 添加插件
        classpath 'org.greenrobot:greendao-gradle-plugin:3.2.2'
    }
}
// 在对应模块 build.gradle:
apply plugin: 'com.android.application'
// 应用插件
apply plugin: 'org.greenrobot.greendao'
 
dependencies {
// 添加依赖
    implementation 'org.greenrobot:greendao:3.2.2'
}
 
//配置数据库版本号，并且不要指定生成文件的路径
greendao {
    schemaVersion 1
}
```


##### 有必要了解下部分注解的含义
```
@Entity：告诉GreenDao该对象为实体，只有被@Entity注释的Bean类才能被dao类操作
 
@Id：对象的Id，使用Long类型作为EntityId，否则报错。(autoincrement = true)表示主键会自增，false使用旧值
 
@Unique：该属性值必须在数据库中是唯一值
 
@Property：可以自定义字段名，外键不能使用该属性
 
@NotNull：属性不能为空
 
@Transient：使用该注释的属性不会被存入数据库的字段中
 
@Generated：编译后自动生成的构造函数、方法等的注释，提示构造函数、方法等不能被修改
 
@ToOne：定义与另一个实体（一个实体对象）的关系 
 
@ToMany：定义与多个实体对象的关系
```
##### 创建实体类
```
@Entity
public class User {
    //不能用int
    @Id
    private Long id;
    @Property(nameInDb = "name")
    private String name;
    @Unique
    private String QQ;
    private int age;
    private String address;
    private Date date;
}
```

##### 创建数据库帮助类
```
public class SqLiteHelper extends DaoMaster.OpenHelper {
    SqLiteHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
    }
}
```
##### 创建数据库管理类

```
public class DatabaseManager {
    private static DaoSession sDaoSession;

    public static void init(Application application) {
        SqLiteHelper helper = new SqLiteHelper(application, "spd.db");
        Database db = helper.getWritableDb();
        sDaoSession = new DaoMaster(db).newSession();
    }

    private static class DatabaseManagerHolder {
        private static final DatabaseManager INSTANCE = new DatabaseManager();
    }

    public static DatabaseManager getInstance() {
        return DatabaseManagerHolder.INSTANCE;
    }

    public DaoSession getDao() {
        return sDaoSession;
    }

}
```