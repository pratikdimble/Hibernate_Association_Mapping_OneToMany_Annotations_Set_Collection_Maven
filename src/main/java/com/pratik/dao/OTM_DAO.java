package com.pratik.dao;

public interface OTM_DAO {
	public void SaveDataUsingParents();
	public void loadDataUsingParent();
	public void addingNewChildToExistingParent();
	public void deleteDataUsingParent();
    public void deleteOneChildFromCollectionOfChildsInAParent();
    public void deleteAllChildsOfAParent();
}
