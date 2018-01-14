package cn.amos.dao.entity;

/**
 * CREATE TABLE `user` (
 * `ID` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
 * `NAME` varchar(128) DEFAULT NULL COMMENT '用户名',
 * `AGE` tinyint(4) DEFAULT NULL COMMENT '年龄',
 * `PHONE_NO` varchar(11) DEFAULT NULL COMMENT '手机号',
 * `ADDRESS` varchar(255) DEFAULT NULL COMMENT '地址',
 * `IDENTITY_NO` varchar(18) DEFAULT NULL COMMENT '身份证号',
 * PRIMARY KEY (`ID`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';
 * <p>
 * PROJECT: boot
 * DATE: 2018/1/12
 *
 * @author DaoYuanWang
 */
public class UserEntity {

    private Long id;
    private String name;
    private Integer age;
    private String phoneNo;
    private String address;
    private String identityNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", identityNo='" + identityNo + '\'' +
                '}';
    }
}
