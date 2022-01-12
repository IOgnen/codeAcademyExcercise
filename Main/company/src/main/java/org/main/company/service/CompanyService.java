package org.main.company.service;

import org.hibernate.Session;

public interface CompanyService {
	
	public void openSession();
	public void addData(Session session);
	
}
