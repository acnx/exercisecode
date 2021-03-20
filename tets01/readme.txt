实现步骤

1. 新建student表
2. 加入mybatis的maven坐标，mysql驱动的坐标
3. 创建实体类domain、entity、
4. 创建持久层的dao接口
5. 创建sql映射文件，一般一个表一个，xml格式
    写在接口所在目录中，和接口名保持一致
6. 创建mybatis主配置文件
    放到resources目录下，名称可以自定义，如mybatis.xml，
7. 创建使用mybatis类，通过mybatis访问数据库

