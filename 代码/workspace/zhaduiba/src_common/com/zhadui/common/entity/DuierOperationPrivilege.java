package com.zhadui.common.entity;

public class DuierOperationPrivilege {

	private int duierOperationPrivilegeId;
	private int duierOperationPrivilegeUseRole;
	private int duierOperationPrivilegePri;
	
	public DuierOperationPrivilege(int duierOperationPrivilegeId,
			int duierOperationPrivilegeUseRole, int duierOperationPrivilegePri) {
		super();
		this.duierOperationPrivilegeId = duierOperationPrivilegeId;
		this.duierOperationPrivilegeUseRole = duierOperationPrivilegeUseRole;
		this.duierOperationPrivilegePri = duierOperationPrivilegePri;
	}
	public DuierOperationPrivilege() {
		super();
	}
	public int getDuierOperationPrivilegeId() {
		return duierOperationPrivilegeId;
	}
	public void setDuierOperationPrivilegeId(int duierOperationPrivilegeId) {
		this.duierOperationPrivilegeId = duierOperationPrivilegeId;
	}
	public int getDuierOperationPrivilegeUseRole() {
		return duierOperationPrivilegeUseRole;
	}
	public void setDuierOperationPrivilegeUseRole(int duierOperationPrivilegeUseRole) {
		this.duierOperationPrivilegeUseRole = duierOperationPrivilegeUseRole;
	}
	public int getDuierOperationPrivilegePri() {
		return duierOperationPrivilegePri;
	}
	public void setDuierOperationPrivilegePri(int duierOperationPrivilegePri) {
		this.duierOperationPrivilegePri = duierOperationPrivilegePri;
	}
	@Override
	public String toString() {
		return "{duierOperationPrivilegeId:"
				+ duierOperationPrivilegeId
				+ ", duierOperationPrivilegeUseRole:"
				+ duierOperationPrivilegeUseRole
				+ ", duierOperationPrivilegePri:" + duierOperationPrivilegePri
				+ "}";
	}
	
}
