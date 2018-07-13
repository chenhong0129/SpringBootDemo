Spring Boot 如何使用声明式事务管理:

声明式事务

Spring 支持声明式事务，使用 @Transactional 注解在方法上表明这个方法需要事务支持。此时，Spring 拦截器会在这个方法调用时，
开启一个新的事务，当方法运行结束且无异常的情况下，提交这个事务。

Spring 提供一个 @EnableTransactionManagement 注解在配置类上来开启声明式事务的支持。
使用了 @EnableTransactionManagement 后，Spring 会自动扫描注解 @Transactional 的方法和类。

Spring Boot默认集成事务
Spring Boot 默认集成事务，所以无须手动开启使用 @EnableTransactionManagement 注解，就可以用 @Transactional注解进行事务管理。
我们如果使用到 spring-boot-starter-jdbc 或 spring-boot-starter-data-jpa，Spring Boot 会自动默认分别注入
DataSourceTransactionManager 或 JpaTransactionManager。