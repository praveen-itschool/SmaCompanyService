package com.nareshIt.raghu.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "company_tab")
@DynamicUpdate
public class Company {
    @Id
    @Column(name = "com_id_col")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "com_name_col")
    private String name;

    @Column(name = "com_cregid_col")
    private String cregId;

    @Column(name = "com_ctype_col")
    private String ctype;

    @Column(name = "com_parentOrg_col")
    private String parentOrg;

    @Column(name = "com_modeOfOperate_col")
    private String modeOfOperate;

    @Column(name = "com_serviceCode_col")
    private String serviceCode;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "aidFK")
    private Address addr; // Ensure this imports the new Address entity class

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

	public String getCregId() {
		return cregId;
	}

	public void setCregId(String cregId) {
		this.cregId = cregId;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getParentOrg() {
		return parentOrg;
	}

	public void setParentOrg(String parentOrg) {
		this.parentOrg = parentOrg;
	}

	public String getModeOfOperate() {
		return modeOfOperate;
	}

	public void setModeOfOperate(String modeOfOperate) {
		this.modeOfOperate = modeOfOperate;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", cregId=" + cregId + ", ctype=" + ctype + ", parentOrg="
				+ parentOrg + ", modeOfOperate=" + modeOfOperate + ", serviceCode=" + serviceCode + ", addr=" + addr
				+ "]";
	}

    // Getters, Setters, and toString methods can be omitted since you're using @Data
    
}
