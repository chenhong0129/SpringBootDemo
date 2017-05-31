# SpringBootDemo
SpringBoot入门

参考博客：http://www.jianshu.com/p/d24bceea7665
                 http://blog.csdn.net/linzhiqiang0316/article/details/52589789
使用Maven构建项目
  1. 通过SPRING INITIALIZR工具产生基础项目
      a. 访问：http://start.spring.io/
      b. 选择构建工具Maven Project、Spring Boot版本1.3.2以及一些工程基本信息，可参考下图所示

       
SPRING INITIALIZR
      c. 点击Generate Project下载项目压缩包
  2. 解压项目包，并用IDE以Maven项目导入，以IntelliJ IDEA 14为例：
      a. 菜单中选择File-->New-->Project from Existing Sources...
      b. 选择解压后的项目文件夹，点击OK
      c. 点击Import project from external model并选择Maven，点击Next到底为止。
      d. 若你的环境有多个版本的JDK，注意到选择Java SDK的时候请选择Java 7以上的版本
项目结构解析


项目结构
通过上面步骤完成了基础项目的创建，如上图所示，Spring Boot的基础结构共三个文件（具体路径根据用户生成项目时填写的Group所有差异）：
  ● src/main/java下的程序入口：Chapter1Application
  ● src/main/resources下的配置文件：application.properties
  ● src/test/下的测试入口：Chapter1ApplicationTests
生成的Chapter1Application和Chapter1ApplicationTests类都可以直接运行来启动当前创建的项目，由于目前该项目未配合任何数据访问或Web模块，程序会在加载完Spring之后结束运行。
引入Web模块
当前的pom.xml内容如下，仅引入了两个模块：
  ● spring-boot-starter：核心模块，包括自动配置支持、日志和YAML
  ● spring-boot-starter-test：测试模块，包括JUnit、Hamcrest、Mockito

引入Web模块，需添加spring-boot-starter-web模块：
   


编写HelloWorld服务
  ● 创建package命名为com.didispace.web（根据实际情况修改）
  ● 创建HelloController类，内容如下

  ● 启动主程序，打开浏览器访问http://localhost:8080/hello，可以看到页面输出Hello World
编写单元测试用例
打开的src/test/下的测试入口Chapter1ApplicationTests类。下面编写一个简单的单元测试来模拟http请求，具体如下：

使用MockServletContext来构建一个空的WebApplicationContext，这样我们创建的HelloController就可以在@Before函数中创建并传递到MockMvcBuilders.standaloneSetup（）函数中。
  ● 注意引入下面内容，让status、content、equalTo函数可用

至此已完成目标，通过Maven构建了一个空白Spring Boot项目，再通过引入web模块实现了一个简单的请求处理。
