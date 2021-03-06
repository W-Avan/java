# **java学习**  

## 数组：  
+ #### 使用Arrays类操作Java中的数组
> Arrays类是Java中提供的一个工具类，在 java.util 包中。该类中包含了一些方法用来直接操作数组。  
> **1.排序**  
> 语法：**Arrays.sort(数组名);**  
> **2.将数组转换成字符串**  
>语法：**Arrays.toString(数组名);**  

+ #### 使用foreach操作数组  
> foreach是for语句的特殊简化版本，在遍历数组、集合时，foreach更简单便捷。  
> 语法：  
> **for(元素类型 元素变量 ： 遍历对象){  
> &emsp;执行的代码  
}**  

+ #### Java中的二维数组  
> 1.声明数组并分配空间  
> **数据类型[][] 数组名 = new 数据类型[行的个数][列的个数];**  
> 或者  
> **数据类型[][] 数组名;**  
> **数组名 = new 数据类型[行的个数][列的个数];**

## 成员变量和局部变量区别：
* ####  1.作用域不同   
>&emsp;局部变量的作用域仅限于定义他的方法   
&emsp;成员变量的作用域在整个类内部都是可见的

* #### 2.初始值不同   
>&emsp;java会给成员变量一个初始值   
&emsp;java不会给局部变量赋予初始值

* #### 3.在同一个方法中,不允许有同名局部变量；在不同的方法中，可以有同名局部变量

* #### 4.两类变量同名时,局部变量具有更高的优先级


## <font color=#5F9EA0> 构造方法（构造函数）：</font>
+ #### <font color=#5F9EA0> 1.使用new+构造方法，创建一个新的对象</font>

+ #### <font color=#5F9EA0> 2.构造方法是定义在java类中的一个用来初始化对象的方法 构造方法与类同名且没有返回值</font>
![](https://github.com/W-Avan/java/raw/master/pic/1.png)
![](https://github.com/W-Avan/java/raw/master/pic/2.png)

+ #### <font color=#5F9EA0> 4.有参构造方法即在()声明参数，可与无参构造方法共存</font>

+ #### <font color=#5F9EA0> 5.当没有指定构造方法时，系统会自动添加无参的构造方法<font>

+ #### <font color=#5F9EA0> 6.当有指定构造方法，无论是有参、无参的构造方法，都不会自动添加无参的构造方法（即不存在系统默认的构造方法）</font>

+ #### <font color=5F9EA0> 7.构造方法的**重载**：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法</font>

+ #### <font color=5F9EA0> 8.构造方法不但可以给对象属性赋值，还可以保证给对象的属性赋一个合理的值（详情见E:\eclipse\project2\src\com\imooc\InitailTelephone.java运行结果）</font>


## Static 静态变量、静态方法和静态初始化块：
+ #### 1.静态变量
&emsp; java中被static修饰的的成员成为静态成员或 **类成员** <font color=#FF0000>它属于整个类所有，不属于某个对象，被所有对象共享，可以用类名直接访问(当系统第一次使用这个类，就为该静态成员分配内存空间，直到该类被卸载才会资源回收)</font>

+ #### 2.静态方法
>&emsp;例：public **static** void print(){...}  
&emsp;<font color=#FF0000>注意：</font>  
&emsp;
a.**静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员**（如果希望在静态方法中调用非静态变量，可以通过创建类的对象，然后通过对象来访问非静态变量)  
&emsp;
b.在普通成员方法中，则可以直接访问同类的非静态变量和静态变量  
&emsp;
c.**静态方法中不能直接调用非静态方法**，需要通过对象来访问非静态方法

+ #### 3.静态初始化块
>&emsp; 类的声明中可以包含多个初始化块，每个初始化块由{...}组成那个创建类的实例时，就会依次执行这些代码。如果使用static修饰初始化块，就称为静态初始化块  
&emsp;<font color=#FF0000>注意：</font>  
&emsp;
**静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量**  
如图：  ![](https://github.com/W-Avan/java/raw/master/pic/3.jpg)

## Java中的包：
+ #### 1.包的作用  
>管理Java文件  
解决同名文件冲突

+ #### 2.定义包：package包名  
>注：必须放在Java源程序第一行  
包名间可以使用"."号隔开    
eg: com.imooc.MyClass

+ #### 3.系统中的包
>java.(功能).(类)  
java.lang.(类) <font color=#5F9EA0>包含java语言基础的类</font>  
java.util.(类) <font color=#5F9EA0>包含java语言中各种工具类</font>  
java.io.(类) <font color=#5F9EA0>包含输入、输出相关功能的类</font>

+ #### 4.包的使用  
>(1)可以通过import关键字，在某个文件使用其他文件中的类。  
&emsp;import com.imooc.music.MyClass  
(2)Java中,包的命名规范是全小写字母拼写  
(3)使用的时候不但可以加载某个包下的所有文件  
&emsp;eg: com.imooc.*****  
&emsp;也可以加载某个具体子包下的所有文件  
&emsp;eg: com.imooc.music.*

## Java中的内部类  
+ #### 内部类可分为以下四种：
> + 成员内部类  
> + 静态内部类  
> + 方法内部类  
> + 匿名内部类

+ #### 成员内部类
> + 内部类中可以直接访问外部类中的数据，而不受访问控制符的影响（外部类中private成员，内部类可直接调用）  
> + 外部类不能直接使用内部类的成员和方法  
> + 如果外部类和内部类具有相同的成员变量或方法，内部类默认访问自己的成员变量或方法，<font color=#FF0000>如果要访问外部类的成员变量，可以使用this关键字,(out.this.b)</font>


+ #### 静态内部类(static)
> + 静态内部类不能直接访问外部类的非静态成员，但可以通过new 外部类().成员 的方式访问  
> + 若外部类的静态成员与内部类的成员名相同，可通过"类名.静态成员" 访问外部类的静态成员(与成员内部类不同的是不用加this);若外部类的静态成员与内部类的成员名不相同，则可通过"成员名"直接调用外部类的静态成员
> + 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 **内部类 对象名 = new 内部类();**

+ #### 方法内部类
> + 内部类定义在外部类的方法中，方法内部类只在该方法的内部可见，及只在该方法内部可以使用，因此方法内部类不能使用访问控制符和static修饰符。(直接定义class xxx（）)

## Java中的继承  
+ #### <font color=#FF0000>Java中的继承是单继承</font>
+ #### 子类拥有父类的所有属性和方法(<font color=#ff0000>属性和方法的修饰符不能为private，这一点同C++</font>)  
+ #### 语法规则：  
> class 子类 <font color=#ff0000>extends</font> 父类  
> 例：class Dog extends Animal{...}

+ #### 方法的重写  
> 1.什么是方法的重写：  
> 如果子类对继承父类的方法不满意，是可以重写父类继承的方法的，当调用方法时会优先调用子类的方法。  
> 2.语法规则：  
> a.返回值类型  
> b.方法名  
> c.参数类型及个数  
> 都要与父类继承的方法相同，才叫方法的重写  

+ #### 继承初始化顺序  
> 1.初始化父类再初始化子类  
> 2.先执行初始化对象中属性，再执行构造方法中的初始化

+ #### final的使用  
> + ##### final关键字  
> &emsp;使用final关键字做标识有“最终的”含义  
> + ##### final可以修饰类、方法、属性和变量  
>> +  final修饰类，则该类不允许被继承  
>> + final修饰方法，则该方法不允许被覆盖(重写)  
>> + final修饰属性  
>> &emsp;则该类的属性不会进行隐式的初始化(类的初始化属性必须有值)  
>> &emsp;或在构造方法中赋值(但只能选其一)  
>> + final修饰变量，则该变量的值只能赋一次值，即变为量

+ #### super的使用  
> ##### super关键字  
> &emsp;在对象的内部使用，可以代表父类对象  
> ##### 1.访问父类的属性  
> &emsp;super.age  
> ##### 2.访问父类的方法  
> &emsp;super.eat()
> ##### 子类的构造的过程中必须调用其父类的构造方法  
> ##### 如果子类的构造方法中没有 显示调用父类的构造方法(super())，则系统默认调用父类无参的构造方法  
> ##### 如果显示的调用构造方法，必须在子类的构造方法的第一行(super())  
> ##### 如果子类构造方法中既没有显式调用父类的构造方法，而父类又没有无参的构造方法，则编译错误

+ #### Object类  
Object类是所有类的父亲，如果一个类没有使用extends关键字明确标识继承另外一个类，那么这个类默认继承Object类。  
Object类中的方法，适合所有子类。
> ##### 1.toString()方法  
> 在Object类里定义toString()方法的时候返回的对象的哈希code码(对象地址字符串)
> ![](https://github.com/W-Avan/java/raw/master/pic/4.png)  
> 可以通过重写toString()方法表示出对象的属性
> ##### 2.equals()方法  
> 比较的是对象的**引用**是否指向同一块内存地址。  
> Dog dog = new Dog()  
> 一般情况下比较两个对象时比较它的值是否一致，所以要进行重写。(source中有直接写好的)

## Java中的多态  
+ #### 对象的多种形态（<font color=#FF0000>继承是多态的实现基础</font>）  
> 1.引用多态  
&emsp;父类的引用可以指向本类的对象  
&emsp;父类的引用可以指向子类的对象(子类的引用不能指向父类的对象)
> 2.方法多态  
&emsp;创建本类对象时，调用的方法为本类方法  
&emsp;创建子类对象时，调用的方法为子类重写的方法或者继承的方法(不能调用子类中独有父类中没有的方法)

+ #### 引用类型转换
> 1.向上类型转换(隐式/自动类型转换)，是小类型到大类型的转换，不存在风险  
> 2.向下类型转换(强制类型转换)，是大类型到小类型
> 3.
instanceof运算符，来解决引用对象的类型，避免类型转换的安全性问题 (具体见project4)

+ #### 抽象类
> 1.语法定义：  
&emsp;抽象类前使用abstract关键字修饰，则该类为抽象类  
> 2.应用场景：  
&emsp;a.在某些情况下，某个弗雷只是知道其子类应该包含怎样的方法，但无法准确知道这些子类如何实现这些方法。  
&emsp;b.从多个具有相同特征的类中抽象出一个抽象类，以这个抽象类作为子类的模板，从而避免了子类设计的随意性。  
> 3.作用：  
&emsp;限制规定子类必须实现某些方法，但不关注实现细节。  
> 4.使用规则：  
&emsp;a.abstract定义抽象类  
&emsp;b.abstract定义抽象方法，<font color=#FF0000>只有声明，不需要实现</font>  
&emsp;c.包含抽象方法的类是抽象类  
&emsp;d.抽象类中可以包含普通的方法，也可以没有抽象方法  
&emsp;e.抽象类不能直接创建，可以定义引用变量(引用多态)

+ #### 接口
> ##### 1.接口概念：  
&emsp;类是一种具体实现体，而接口定义了某一批类所需要遵守的规范，接口不关心这些类的内部数据，也不关心这些类里方法的实现细节，它只规定这些类里必须提供某些方法。  
> ##### 2.接口定义：  
&emsp;和类定义不同，定义接口不再使用class关键字，而是使用interface关键字。  
> 接口定义的基本语法：  
> [修饰符] interface 接口名 [extends 父接口1,父接口2...]  
{  
&emsp;零个到多个常量定义...  
&emsp;零个到多个抽象方法的定义...  
}  
接口就是用来被继承、被实现的，修饰符一般建议用<font color=#FF0000>public</font>  
> <font color=#ff0000>注意：</font>不能使用<font color=#ff0000>private</font>和<font color=#ff0000>protected</font>修饰接口，接口定义不写方法体，只声明。  
> #### 3.接口定义  
> &emsp;**常量：**  
&emsp;接口中的属性是常量，即使定义时不添加public static final 修饰符，系统也会自动加上。  
> &emsp;**方法：**  
&emsp;接口中的方法只能是抽象方法，总是使用，即使定义时不添加public abstract 修饰符，系统也会自动加上。  
> #### 4.使用接口  
&emsp;一个类可以实现一个或多个接口，实现接口使用**implements**关键字。Java中一个类只能继承一个父类，是不够灵活的，通过实现多个接口可以做补充。  
> ##### 继承父类实现接口的语法为：  
[修饰符] class 类名 <font color=#ff0000>extends</font> 父类 <font color=#ff0000>implements</font> 接口1，接口2...    
{  
&emsp;类体部分//如果继承了抽象类，需要实现继承的抽象方法；要实现接口中的抽象方法。  
}  
> 如果要继承父类，继承父类必须在实现接口之前  
> ##### 使用接口：  
&emsp;接口在使用过程当中，还经常与匿名内部类配合使用  
&emsp;匿名内部类就是没有名字的内部类  
&emsp;多用于关注实现而不关注实现类的名称  
>> 语法格式：  
&emsp;interface i = new Interface(){  
&emsp;  public void method(){  
&emsp;   System.out.println("匿名内部类实现接口的方式");  
  &emsp;}  
}

+ #### UML简介  
> ##### 1.UML概念  
&emsp;Unified Modeling Language(UML)  
&emsp;又称统一建模语言或标准建模语言  
&emsp;是一个支持模型化和软件系统开发的图形化语言  
&emsp;为软件开发的所有阶段提供模型化和可视化支持  
> ##### 2.UML图示  
&emsp;UML2.2中一共定义了14中图示(diagrams)。  
> ##### 3.常用UML图
> + 用例图(The Use Case Diagram)  
&emsp;用例图能够以可视化的方式，表达系统如何满足所收集的业务规则，以及特定的用户需求等信息。   
![](https://github.com/W-Avan/java/raw/master/pic/5.png)    
> + 序列图(The Sequence Diagram)  
&emsp;序列图用于按照交互发生的一系列顺序，显示对象之间的这些交互。
![](https://github.com/W-Avan/java/raw/master/pic/6.png)  
> + 类图(The Class Diagram)  
&emsp;UML类图、业务逻辑和所有支持结构一同被用于定义全部的代码结构。  
![](https://github.com/W-Avan/java/raw/master/pic/7.png)   
> 4.UML建模工具  
&emsp;Visio、Rational Rose、PowerDesign三种建模工具应用最广  

## 异常与异常处理：
+ #### 处理异常  
try-catch以及try-catch-finally  
> <font color=#FF0000>try</font>{  
&emsp; //一些会抛出异常的方法  
}<font color=#ff0000>catch</font> (Exception e){  
&emsp; //处理该异常的代码块  
}<font color=#ff0000>catch</font> (Exception2 e){  
&emsp; //处理Exception2的代码块  
}...(n个catch块)...{  
} finally {  
&emsp; //最终将要执行的一些代码  
}  
编写多重catch语句块时应按照先小后大(先子类后父类)的顺序  

+ #### Java中的异常抛出以及自定义异常  
 **异常抛出：**
> throw —— 将产生的异常抛出(动作)  
throws —— 声明将要抛出何种类型的异常(声明)  
&emsp; publc void 方法名(参数列表)  throws 异常列表 {  
&emsp; //调用会抛出异常的方法或者：  
&emsp; throw new Exception();  
}  

 **自定义异常：**  
 > class 自定义异常类 extends 异常类型{  
>   
}  

+ #### Java中的异常链
+ #### 实际应用中的经验与总结
> 1.处理运行时异常时，采用逻辑去合理规避同时辅助try-catch处理  
2.在多重catch块后面，可以加一个catch(Exception)来处理可能会被遗漏的异常  
3.对于不确定的代码，也可以加上try-catch，处理潜在的异常  
4.尽量去处理异常，切忌只是简单的调用printStackTrace()去打印输出  
5.具体如何处理异常，要根据不同的业务需求和异常类型去决定  
6.尽量添加finally语句块去释放占用的资源
>  
> <font color=#ff2569>e.toString()：  获得异常种类和错误信息  
e.getMessage():获得错误信息  
e.printStackTrace()：在控制台打印出异常种类，错误信息和出错位置等</font>  

## Java中的字符串:  
+ #### 字符串的不变性  
> String对象创建后则不能被修改，是不可变的，所谓的修改其实时创建了新的对象，所指向的内存空间不同  
每次new一个字符串就是产生一个新的对象，即便两个字符串的内容相同，使用"=="比较时也为"false"，如果只需比较内容是否相同，应使用"equals()"方法  

+ #### String类的常用方法  
>![](https://github.com/W-Avan/java/raw/master/pic/8.jpg)  
> + 字符串str中字符的索引从0开始，范围为0到str.length()-1 (与位置相关，都是从第0个开始数)
> + 使用indexOf进行字符或字符串查找时，如果匹配返回位置索引；如果没有匹配结果，返回-1  
> + 使用substring(beginIndex, endIndex)进行字符串截取时，包括beginIndex位置的字符，不包括endIndex位置的字符  
> + "=="：判断两个字符串在内存中首地址是否相同，即判断是否是同一个字符串对象  
equals()：比较储存在两个字符串对象中的内容是否一致(比较字符串，单个字符不能使用)  

+ #### Java中的StringBuilder类  
> &emsp; String类具有不可变性，会额外创建一个对象，StringBuilder或StringBuffer就可以避免这个问题。StringBuffer是线程安全的，而StringBuilder则没有实现线程安全功能，所以性能略高。一般如果需要创建一个内容可变的字符串对象，应优先考虑使用StringBuilder类  
> ![](https://github.com/W-Avan/java/raw/master/pic/9.jpg)  

## Java中的常用类  
+ #### Java中的包装类
> Java为每个基本数据类型都提供了一个包装类，为了让基本数据类型也具备对象的特性
 ![](https://github.com/W-Avan/java/raw/master/pic/10.jpg)  
> 包装类主要提供了两大类方法：
> 1. 将本类型和其他基本类型进行转换的方法
> 2. 将字符串和本类型及包装类互相转换的方法<br>  
>
> **装箱：** 把基本类型转换成包装类，使其具有对象的性质，又可分为手动装箱和自动装箱  
> int i = 10; <font color=#7fffd4>//定义一个int基本类型值</font>  
> Integer x = new Integer(i); <font color=#7fffd4>//手动装箱</font>  
> Integer y = i; <font color=#7fffd4>//自动装箱</font>  
**拆箱：** 和装箱相反，把包装类对象转换成基本类型的值，又可分为手动拆箱和自动拆箱  
> Integer j = new Integer(8); <font color=#7fffd4>//定义一个Integer包装类对象，值为8</font>  
> int m = j.intValue(); <font color=#7fffd4>手动拆箱为int类型</font>  
> int n = j; <font color=#7fffd4>//自动拆箱为int类型</font>  

+ #### Java中基本类型和字符串之间的转换  
> 基本类型转换为字符串有三种方法：
> 1. 使用包装类的 toString() 方法  
> 2. 使用String类的 valueOf() 方法  
> 3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串  
> ![](https://github.com/W-Avan/java/raw/master/pic/11.jpg)  
>
> 将字符串转换成基本类型有两种方法：  
> 1.调用包装类的parseXxx静态方法  
> 2.调用包装类的valueOf()方法转换为基本类型的包装类，会自动拆箱  
>![](https://github.com/W-Avan/java/raw/master/pic/12.jpg)  

+ #### 使用Date和SimpleDateFormat类表示时间  
> &emsp;使用Date类的**默认无参构造方法**创建出的对象就代表**当前时间**  
> Wed Jun 11 09:22:30 CST 2014  
> &emsp;使用SimpleDateFormat来对日期时间进行格式化，如可以将日期转换为指定格式的文本，也可将文本转换为日期  
>
> 1.使用format()方法将日期转换为指定格式的文本<font color=#ff0000>(对象转换为字符串)</font>  
> ![](https://github.com/W-Avan/java/raw/master/pic/13.jpg)  
> 代码中的 “yyyy-MM-dd HH:mm:ss” 为预定义字符串， yyyy 表示四位年， MM 表示两位月份， dd 表示两位日期， HH 表示小时(使用24小时制)， mm 表示分钟， ss 表示秒，这样就指定了转换的目标格式，最后调用 format() 方法将时间转换为指定的格式的字符串。  
>  
> 2.使用parse()方法将文本转换为日期<font color=#ff0000>(字符串转换为对象)</font>  
> ![](https://github.com/W-Avan/java/raw/master/pic/14.jpg)  
>
> <font color=#ff0000>注意：</font>  
> &emsp;1.调用 SimpleDateFormat 对象的 parse() 方法时可能会出现转换异常，即 ParseException ，因此需要进行<font color=#ff0000>异常处理</font>  
> &emsp;2.使用 Date 类时需要导入 java.util 包，使用 SimpleDateFormat 时需要导入java.text 包   
+ #### Calendar 类的应用  
> java.util.Calendar 类是一个抽象类，可以通过调用 getInstance() 静态方法获取一个 Calendar 对象，此对象已由当前日期时间初始化，即默认代表当前时间，如 Calendar c = Calendar.getInstance();  
> ![](https://github.com/W-Avan/java/raw/master/pic/15.jpg)  
> Calendar 类提供了 getTime() 方法，用来获取 Date 对象，完成 Calendar 和 Date 的转换，还可通过 getTimeInMillis() 方法，获取此 Calendar 的时间值，以毫秒为单位。如下所示：  
> ![](https://github.com/W-Avan/java/raw/master/pic/16.jpg)  

+ #### 使用Math类操作数据  
> &emsp;Math 类位于 java.lang 包中，包含用于执行基本数学运算的方法， Math 类的所有方法都是静态方法，所以使用该类中的方法时，可以直接使用类名.方法名，如： Math.round();  
> &emsp;常用的方法：  
> ![](https://github.com/W-Avan/java/raw/master/pic/17.jpg)  
> 通过案例我们来认识一下他们的使用吧！！  
> ![](https://github.com/W-Avan/java/raw/master/pic/18.jpg)  
>(注意随机数格式，产生[0,1) 和 [0,99)的区别)  

## Java中的集合框架：  
+ #### Java中的集合框架概述  
> + **集合的概念：**  
> &emsp;<font color=#ff0000>Java中的集合类：是一种工具类，就像是容器，储存任意数量的具有共同属性的对象</font>  
> + **集合的作用：**  
> &emsp;1.在类的内部，对数据进行组织；  
> &emsp;2.简单而快速的搜索大数量的条目；  
> &emsp;3.有的集合接口，提供了一系列排列有序的元素，并且可以在序列中间快速的插入或者删除有关元素；  
> &emsp;4.有的集合接口，提供了映射关系，可以通过关键字(key)去快速查找到对应的唯一对象，而这个关键字可以是任意类型。  
> + **Java集合框架体系结构：**  
> ![](https://github.com/W-Avan/java/raw/master/pic/19.png)  
>> + Collection 和 Map 是Java集合中的两个根接口(Collection中储存单个对象，Map中储存一对一对的key和value)  
>> + List(序列) Queue(队列) Set(集) 是 Collection 的子接口，其中 List 和 Queue 是排列有序可以重复的, Set 中的元素无序且不能重复(其中 List 和 Set 比较常用)    
>> + ArrayList LinkedList HashSet 三个是实现类  
>> + HashMap(哈希表)是Map的实现类  
>> + <Key, Value>是映射， Entry类是Map的内部类   
+ #### Collection 接口 & List 接口简介  
> + **Collection接口**  
> 是List、Set、Queue接口的父接口  
> 定义了可用于操作List、Set和Queue的方法——增删改查  
>> + **List接口及其实现类——ArrayList**  
>> &emsp;1.List是元素有序并可以重复的集合，被称为序列  
>> &emsp;2.List可以精确的控制每个元素的插入位置，或删除某个位置元素  
>> &emsp;3.ArrayList——数组序列，是List的一个重要实现类  
>> &emsp;4.ArrayList底层是由数组实现的    
+ #### <font color=#ff0000>对象存入集合都变成Object类型，取出时需要类型转换</font>  
+ #### 泛型（ List < type > ListName ）  
> **集合中的元素，可以是任意类型的对象(对象的引用)**  
> &emsp;如果把某个对象放入集合，则会忽略他的类型，而把它当作Object处理  
> **泛型则是规定了某个集合只可以存放特定类型的对象**  
> &emsp;会在编译期间进行类型检查  
> &emsp;可以直接按指定类型获取集合元素  
> &emsp;取出时也不用进行类型强转，存入和取出的都是指定的类型，b不是Object  
> **泛型集合中除了可以存放泛型类型的对象，还可以存放泛型的子类型的对象**  
> **1.泛型集合中的限定类型不能使用基本数据类型**  
> **2.可以通过使用<font color=#ff0000>包装类</font>限定允许存入的基本数据类型 (Integer、 Long、 Boolean等)**  
+ #### Set接口及其实现类——HashSet  
> + Set是元素无序并且不可以重复的集合，被称为集  
> + HashSet ——哈希集，是 Set 的一个重要实现类  
> + Set 中无 List 中的 set()方法去修改某个位置上的元素，因为List有序，Set无序  
> + Set 只能用 foreach 或 iterator 方法遍历输出，不能像List使用 get() 方法   
+ #### Map 和 HashMap  
> + **Map 接口**  
>> + Map 提供了一种映射关系，其中的元素是以键值对(key-value)的形式存储的，能够实现根据 key 快速查找 value  
>> + Map中的键值对以Entry类型的对象实例形式存在  
>> + 键(key 值)不可重复，value 值可以  
>> + 每个键最多只能映射到一个值  
>> + Map 支持泛型， 形式如: Map<K, V>
> + **HashMap 类**
>> + HashMap 是 Map 的一个重要实现类，也是最常用的，基于哈希表实现  
>> + HashMap 中的 Entry 对象是无序排列的  
>> + Key 值和 value 值都可以为 null，但是一个 HashMap只能有一个 key 值为 null 的映射(key 值不可重复)  
+ #### Comparable 和 Comparator  
> + **Comparable 接口——可比较的**  
>> + 实现该接口表示：这个类的实例可以比较大小，可以进行自然排序  
>> + 定义了默认的比较规则  
>> + 其实现类需实现compareTo()方法  
>> + compareTo() 方法返回正数表示大，负数表示小，0表示相等  
> + **Comparator 接口——比较工具接口**
>> + 用于定义<font color=#ff0000>临时</font>比较规则，而不是默认比较规则  
>> + 其实现类需要实现compare()方法  
>> + Comparator 和 Comparable 都是 Java 集合框架的成员   

+ #### Collections工具类(详细讲解了其中sort()方法)   
> Comparable 接口和 Comparator 接口就是用于sort()方法
+ #### Java集合框架  
> ![](https://github.com/W-Avan/java/raw/master/pic/20.png)

## I/O操作：
+ #### 常用方法：
> &emsp; **File是用来建立联系的**  
> **1.文件名**
>> getName() 文件名、路径名  
>> getPath() 路径名
>> getAbsoluteFile() 绝对路径所对应的 File 对象  
>> getAbsolutePath() 绝对路径名  
>> getParent() 父目录，相对路径的父目录，可能为 null ，如，删除本身后的结果  
>
> **2.判断信息**
>> exists()  
>> canWrite()  
>> canRead()  
>> isFile()  
>> isDirectory()  
>> isAbsolute(); 消除平台差异，e以盘符开头，其他以/开头
>
> **3.长度 字节数 不能读取文件夹的长度**
>> length()
>
> **4.创建、删除**  
>> createNewFile() 不存在创建新文件，存在返回false  
>> delete() 删除文件  
>> static createTempFile(前缀三个字节长，后缀默认.temp) 默认临时空间  
>> static createTempFile(前缀三个字节长， 后缀默认.temp， 目录) 目录用 eg: new File("E:/GUI")    
>> deleteOnExit() 退出虚拟机删除，常用于删除临时文件  
>
> **5.操作目录**  
>> mkdir() 创建目录，必须确保父目录存在，如果不存在，创建失败  
>> mkdirs()  创建目录，如果父目录链不存在一同创建
>> list() 文件|目录字符串形式  
>> listFiles()  
>> static listRoots() 根路径

+ #### 原理及概念：  
> **一.概念**  
>> 流： 流动、 流向 从一端移动到另一端 源头与目的地  
>> 程序 与 文件|数组|网络连接|数据库 ， 以程序为中心  
>>
> **二.IO流分类**
>> 1.流向：输入流与输出流  
>> 2.数据：  
>> &emsp; 字节流：二进制， 可以一切文件 包括 纯文本 doc 音频、 视频等等  
>> &emsp; 字符流：文本文件，只能处理纯文本  
>> 3.功能：  
>> &emsp; 节点：包裹源头  
>> &emsp; 处理： 增强功能，提供性能   
>
> **三.字符流与字节流(重点) 与 文件**  
>> 1.字节流   
>> &emsp; 输入流： InputStream  read(byte[] b)、 read(byte[] b , int off, int len) + close()   
>> &emsp; FileInputStream()  
>> &emsp; 输出流： OutputStream  write(byte[] b)、write(byte[] b, int off, int len) + flush() + close()  
>> &emsp; FileOutputStream()  
> 2.字符流  
>> &emsp; 输入流： Reader  read(char[] cbuf)、 read(char[] cbuf, int off, int len) + close()  
>> &emsp; FileReader()  
>> &emsp; 输出流： Writer  write(char[] cbuf)、write(char[] cbuf, int off, int len) + flush() + close()
>> &emsp; FileWriter()   
>
> **四.操作**  
>> 1. 举例： 搬家---------->读取文件  
>> 1). 关联房子---------->建立与文件联系   
>> 2). 选择搬家---------->选择对应流  
>> 3). 搬家---------->读取|写出  
>> &emsp; a).卡车大小---------->数组大小  
>> &emsp; b).运输---------->读取、写出  
>> 4).打发over---------->释放资源  
>> 2. 操作：  
>> 1)建立联系  
>> 2)选择流  
>> 3)操作 数组大小 + read、 write  
>> 4)释放资源    
+ #### 读取文件与写出文件  
> + #### 字节流   
> **字节流： 可以处理一切文件，包括二进制 音频、视频。。。**  
> 节点流：InputStream FileInputStream   
> &emsp; OutputStream FileOutputStream     
> **一.读取文件**  
>> 1.建立联系、 File 对象  源头   
>> 2.选择流 文件输入流 InputStream FileInputStream  
>> 3.操作 ： byte[] car = new byte[1024]; + read + 读取大小  
>> &emsp; 输出  
>> 4.释放资源 ： 关闭  
>>
> **二.写出文件**  
>> 1.建立联系、 File 对象  目的地  
>> 2.选择流 文件输出流 OutputStream FileOutputStream  
>> 3.操作 ： write() + flush   
>> 4.释放资源 ： 关闭  
>>
> **三.拷贝文件 程序为桥梁**  
>> 1.建立联系、 File 对象  源头 目的地   
>> 2.选择流 文件输入流 InputStream FileInputStream  
>> &emsp; 文件输出流 OutputStream FileOutputStream  
>> 3.操作 ： 拷贝  
>> byte[] flush = new byte[1024];   
>> int len = 0;  
>> while(-1 != (len = 输入了.read(flush))) {  
>> &emsp; 输出流.write(flush, 0, len)  
>> &emsp; }  
>> 输出流.flush  
>> 4.释放资源 ： 关闭  两个流   
>>
> **四.文件夹拷贝**   
>> 1.递归查找子孙级文件|文件夹  
>> 2.文件 复制(IO流复制)  
>> &emsp; 文件夹 创建   
>> 3.不能父目录拷贝到子目录中  
>> 删除超长目录(robocopy)
>>    
> + #### 字符流  
> **字符流： 只能处理 纯文本， 全部为可见字符 .txt .html**  
> 字节流： Reader FileReader  
> &emsp; Writer FileWriter  
> **一.纯文本读取**  
>> 1.建立联系  
>> 2.选择流  Reader FileReader  
>> 3.读取 char[] flush = new char[1024];  
>> 4.关闭  
>>
> **二.纯文本写出**  
>> 1.建立联系  
>> 2.选择流   Writer FileWriter  
>> 3.读取 write(字符数组,  0, 长度) + flush  
>> &emsp; write(字符串)  
>> &emsp; append(字符|字符串)  
>> 4.关闭   
>>
> + #### 处理流  
> **处理流：增强功能、提高性能， 节点流之上**  
>>    
> **一.缓冲流**  
>> 1).字节缓冲流  
>> BufferedInputStream  
>> BufferedOutputStream  
>> 2).字符缓冲流  
>> BufferedReader  readLine()  
>> BufferedWriter  newLine()  
>>
> **二.转换流: 字节流 转为字符流  处理乱码(编码集、解码集)**  
>> 1.编码与解码概念  
>> &emsp; 编码： 字符 --编码字符集-> 二进制  
>> &emsp; 解码： 二级制  -解码字符集-> 字符  
>> 2.乱码：  
>> &emsp; 1)编码与解码的字符集不统一  
>> &emsp; 2)字符缺少，长度丢失  
>> 3.文件乱码  
>>
> + #### 其他流  
> **一.节点流**  
>> 1.字节数组 字节 节点流  
>> &emsp; 输入流： ByteArrayInputStream  read(byte[] b, int off, int len ) + close() (close可有可无)  
>> &emsp; 输出流：  ByteArrayOutputStream  write(byte[] b, int off, int len) <font color=#ff0000> + toByteArray() 有新增方法，不要使用多态</font>  
>>
> **二.处理流**  
>> 1.基本类型 + String 保留数据 + 类型  
>> &emsp;  输入流： DataInputStream  readXxx
>> &emsp; 输出流：  DataOutputStream  writeXxx  
>>  2.引用类型(对象) 保留数据 + 类型  
>> &emsp; 反序列化 输入流： ObjectInputStream readObject()  
>> &emsp; 序列化 输出流： ObjectOutputStream writeObject()  
>> &emsp; **注意：**  
>> 1)先序列化后反序列化； 反序列化顺序必须和序列化一致  
>> 2)不是所有的对象都可以序列化， java.io.Serializable  
>> &emsp; 不是所有的属性都需要序列化， transient(透明)  
>>
> + #### 关闭方法  
> **1.编写工具类，实现关闭功能**   
> + #### 总结  
>> ![](https://github.com/W-Avan/java/raw/master/pic/21.png)  
>> *****
>> ![](https://github.com/W-Avan/java/raw/master/pic/22.png)  

## 多线程
 + #### 概念   
 > **一、程序 进程 线程**  
 >> 1、程序：指令集 静态概念  
 >> 2、进程：操作系统 调度程序 动态概念  
 >> 3、线程：在进程内多条执行路径   

 + #### 创建  
 > **一、继承Thread + run()**  
 > &emsp; 启动：创建子类对象 + 对象.start()  
 > **二、实现Runnable + run()**  
 > &emsp; 启动：使用静态代理  
 >> 1、创建真实角色  
 >> 2、创建代理角色 Thread + 引用  
 >> 3、代理角色.start()   
 >>
 > **推荐使用接口：**  
 >> 1、避免单继承局限性  
 >> 2、便于共享资源   
 >>
 > **三、了解 通过Callable接口实现多线程**  
 > &emsp; **优点：** 可以获取返回值  
 > &emsp; **缺点：** 繁琐  
 >> Callable 和 Future 接口
 >> Callable 是类似于Runnable的接口，实现Callable接口的类和实现Runnable的类都是可被其他线程执行的任务。  
 >> Callable 和 Runnable 有几点不同：  
 >> &emsp; 1) Callable规定的方法是 call()， Runnable规定的方法是 run()  
 >> &emsp; 2) call() 方法可抛出异常，而 run()方法是不能抛出异常的。  
 >> &emsp; 3) Callable 的任务执行后可返回值，运行 Callable 任务课拿到一个Future对象，而 Runnable 的任务是不能返回值的。  
 >> &emsp; Future 表示异步计算的结果，它提供了检查计算是否完成的方法，以等待计算的完成，并检索计算的结果。  
 >> &emsp; 通过 Future 对象课了解任务执行情况，可取消任务的执行，还可获取任务执行的结果。  
 >
 > &emsp; **思路：**  
 >> 1)、创建 Callable 实现类 + 重写 call  
 >> 2)、借助 执行调度服务 ExecutorService，获取 Future 对象  
 >> &emsp; **ExecutorService ser = Executors.newFixedThreadPool(2);**  
 >> &emsp; **Future result = ser.submit(实现类对象)**  
 >> 3)、获取值 **result.get()**  
 >> 4)、停止服务 **ser.shutdownNow();**

 + #### 状态  
 > **一、线程状态**  
 >> ![](https://github.com/W-Avan/java/raw/master/pic/23.png)   
 >>
 > **二、停止线程**  
 >> 1、自然终止线程体正常执行完毕  
 >> 2、外部干涉：  
 >> &emsp; 1)、线程类中 定义 线程体使用的标识  
 >> &emsp; 2)、线程体使用该标识   
 >> &emsp; 3)、对外提供方法改变标识  
 >> &emsp; 4)、外部根据条件调用该方法即可    
 >  
 > **三、阻塞**  
 >> 1、join：合并线程  (在谁的线程体内使用，阻塞谁)  
 >> 2、yield：暂停自己的线程 static (在谁的线程体内调用，暂停谁)  
 >> 3、sleep：休眠， 不释放锁  
 >> &emsp; 1)、与时间相关：倒计时  
 >> &emsp; 2)、模拟网络延时    

 + #### 同步   
 > **同步：并发 多个线程访问同一份资源 确保资源安全 --> 线程安全**  
 > **synchronize --> 同步**  
 >
 > **一、同步块** (在方法内部)  
 >> synchronized(**引用类型 | this | 类.class**) {
 >>      
 >>}  
 >
 > **二、同步方法**  
 >> synchronized  
 >
 > **三、死锁：过多的同步容易造成死锁**   

 + #### 生产者消费者模式  
 > + 一个场景，共同的资源  
 > + 生产者消费者模式 信号灯法  
 > &emsp; wait() :等待、释放锁  sleep  :不释放锁  
 > &emsp; notify() / notifyAll() : 唤醒  
 > + 与synchronized一起使用  
 >    
 >  信号灯  
 >	flag  --> T， 生产者生产，消费者等待，生产完成后通知消费  
 > flag  --> F， 消费者消费，生产者等待，消费完成后通知生产   

 + #### 任务调度
 > 了解：   
 > Timer()  
 > schedule(TimerTask task, Date time)  
 > schedule(TimerTask task, Date firstTime, long period)  
 > 自学quartz   

 + #### 总结  
 > **一、创建线程 （重点）**  
 >> **1、继承 Thread**  
 >> **2、实现 Runnable**  
 >> 3、实现 Callable (了解)  
 >  
 > **二、线程的状态**  
 > ![](https://github.com/W-Avan/java/raw/master/pic/23.png)  
 >> 1、新生 --> start --> 就绪 --> 运行 --> 阻塞 --> 终止  
 >> **2、终止线程 (重点)**  
 >> 3、阻塞： join yield **sleep**  
 >
 > ![](https://github.com/W-Avan/java/raw/master/pic/24.png)   
 >  
 > **三、线程的信息**  
 >> 1、Thread.currentThread  
 >> 2、获取名称 设置名称 设置优先级 判断状态  
 >  
 > **四、同步： 对同一份资源**  
 >> synchronized(引用类型变量 | this | 类.class){  
 >> }  
 >>  
 >> 修饰符 synchronized 方法的签名 {  
 >>  &emsp; 方法体  
 >> }  
 >>过多的同步可能造成死锁  
 >
 > **五、生产者消费者模式**
 >
 > **六、任务调度**  
 >  
 > 后期： juc quartz


 ## 网络编程  
 + #### 概念  
 > **一、网络：**  
 > &emsp; 将不同区域的计算机连接到一起 局域网 城域网 互联网  
 >  
 > **二、地址：**  
 > &emsp; IP地址 确定网络上 一个绝对地址 | 位置 ---> 房子的地址  
 >  
 > **三、端口号：**  
 > &emsp; 区分计算机软件的 --> 房子的房门 2个字节 0-65535 共65536个  
 > &emsp; 1、在同一个协议下 端口号不能重复 不同协议下端口号可以重复  
 > &emsp; 2、1024以下的不要使用 80 --> http 21 --> ftp  
 >  
 > **四、资源定位：**  
 > &emsp; URL 统一资源定位符 URI：统一资源  
 >  
 > **五、数据的传输：**  
 >  &emsp; **1、协议： TCP 和 UDP 协议**  
 > &emsp; &emsp; 1)、TCP(transfer control protocol): 电话 类似于三次握手 面向连接 安全可靠 效率低下  
 > &emsp; &emsp; 2)、UDP(UserDatagramProtocol): 短信 非面向连接 效率高  
 > &emsp; 2、传输：  
 > &emsp; &emsp; 1)、先封装  
 > &emsp; &emsp; 2)、后拆封  
 >  
 >  
 >  
 > **-->类**  
 > 1、InetAddress InetSocketAddress  
 > 2、URL  
 > 3、TCP: ServerSocket Socket  
 > 4、UDP: DatagramSocket DatagramPacket  
 >  
 + #### 地址 及 端口  
 > **1、InetAdress ： 封装 IP 及 DNS**  
 > 方法:  
 >  &emsp; getHostAddress() 返回ip地址  
 > &emsp; getHostName() 返回域名 | 本机为计算机名  
 > &emsp; InetAddress.getLocalHost()  
 > &emsp; InetAddres.getByName("ip地址|域名")    
 >  
 > **2、InetSocketAddress： 封装端口**  
 > &emsp; 1)、创建对象：  
 > &emsp; &emsp; InetSocketAddress(String hostname, int port)   
 > &emsp; &emsp; InetSocketAddress(InetAddress addr, int port)  
 > &emsp; 2)、方法：  
 > &emsp; &emsp; getAddress()  
 > &emsp; &emsp; getHostName()  
 > &emsp; &emsp; getPort()  
 >  
 + #### URL  
 > **URI(uniform resource identifier) 统一资源标识符，用来唯一的标识一个资源**  
 > **URL(uniform resource locator) 统一资源定位器，它是一种具体的URI**  
 >  
 > **四部分组成： 协议 存放资源的主机域名 端口 资源文件名(/)**  
 >  
 > **URL:**  
 > **一、创建**  
 > &emsp; URL(String spec) : 绝对路径构建  
 > &emsp; URL(URL context, String spec) : 相对路径构建   
 >  
 > **二、方法**  
 > &emsp; URL url = new URL("http://www.baidu.com:80/index.html#aa?uname=wyf");  
 > &emsp;	System.out.println("协议：" + url.getProtocol());  
 > &emsp; System.out.println("域名：" + url.getHost());  
 > &emsp;	System.out.println("端口号：" + url.getPort());  
 > &emsp;	System.out.println("资源：" + url.getFile());  
 > &emsp; System.out.println("相对路径:" + url.getPath());  
 > &emsp; System.out.println("锚点：" + url.getRef());   //锚点  
 > &emsp; System.out.println("参数：" + url.getQuery()); //?参数：存在锚点 返回null，不存在，返回正确   
 >  
 > **三、流**  
 > &emsp; openStream()  
 >  
 + #### UDP 通信   
 > ##### UDP: 以数据为中心 非面向连接 不安全 数据可能丢失 效率高
 >  
 > ##### 一、类 DatagramSocket DatagramPacket  
 > **1、客户端**  
 >> 1)、创建客户端 DatagramSocket 类 + 指定端口  
 >> 2)、准备数据 字节数组  
 >> 3)、打包 DatagramPacket + 服务器地址 及 端口  
 >> 4)、发送  
 >> 5)、释放资源  
 >>
 > **2、服务器端**  
 >> 1)、创建 服务器 DatagramSocket 类 + 指定端口    
 >> 2)、准备接收容器 字节数组 封装 DatagramPacket   
 >> 3)、包 接收数据    
 >> 4)、分析    
 >> 5)、释放资源  
