<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
"<a class="vglnk" href="http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd" rel="nofollow"><span>http</span><span>://</span><span>www</span><span>.</span><span>hibernate</span><span>.</span><span>org</span><span>/</span><span>dtd</span><span>/</span><span>hibernate</span><span>-</span><span>configuration</span><span>-</span><span>3</span><span>.</span><span>0</span><span>.</span><span>dtd</span></a>">
 
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.driver_class">org.h2.Driver</property>
        <property name="hibernate.connection.url">jjdbc:h2:~/test</property>
        <property name="hibernate.connection.username">sa</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="show_sql">true</property>
        <property name="format_sql">true</property>
        <property name="hbm2ddl.auto">update </property>
        <mapping resource="user.hbm.xml" />
    </session-factory>
</hibernate-configuration>