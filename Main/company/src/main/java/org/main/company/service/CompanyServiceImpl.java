package org.main.company.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.main.company.entity.Department;
import org.main.company.entity.DepartmentLocations;
import org.main.company.entity.DepartmentLocationsId;
import org.main.company.entity.Dependent;
import org.main.company.entity.DependentId;
import org.main.company.entity.Employee;
import org.main.company.entity.Project;
import org.main.company.entity.WorksOn;
import org.main.company.entity.WorksOnId;

public class CompanyServiceImpl implements CompanyService {

	static SessionFactory factory;

	public void openSession() {

		try {
			Configuration cfg = new Configuration();

			cfg.addAnnotatedClass(org.main.company.entity.Department.class);
			cfg.addAnnotatedClass(org.main.company.entity.DepartmentLocations.class);
			cfg.addAnnotatedClass(org.main.company.entity.Project.class);
			cfg.addAnnotatedClass(org.main.company.entity.Employee.class);
			cfg.addAnnotatedClass(org.main.company.entity.Dependent.class);
			cfg.addAnnotatedClass(org.main.company.entity.WorksOn.class);
			cfg.configure();

			factory = cfg.configure().buildSessionFactory();

			Session session = factory.openSession();
			
			addData(session);
			session.close();
			
		} catch (HibernateException e) {
			System.out.println(e);
		}

	}

	public void addData(Session session) {

		Transaction tx = null;
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		try {
			
			tx = session.beginTransaction();
			
			date = df.parse("1988-05-22");
			Department d1 = new Department("Research", 5, 333445555, date);
			
			date = df.parse("1995-01-01");
			Department d2 = new Department("Administration", 4, 987654321, date);
			
			date = df.parse("1981-06-19");
			Department d3 = new Department("Headquarters", 1, 888665555, date);
			
			List<Project> lp1 = new ArrayList<Project>();
			List<Project> lp2 = new ArrayList<Project>();
			List<Project> lp3 = new ArrayList<Project>();
			Project p1 = new Project("ProductX", 1, "Bellaire");
			Project p2 = new Project("ProductY", 2, "Sugarland");
			Project p3 = new Project("ProductZ", 3, "Houston");
			Project p4 = new Project("Computerization", 10, "Stafford");
			Project p5 = new Project("Reorganization", 20, "Houston");
			Project p6 = new Project("Newbenefits", 30, "Stafford");
			lp1.add(p1);
			lp1.add(p2);
			lp1.add(p3);
			lp2.add(p4);
			lp2.add(p6);
			lp3.add(p5);
			
			d1.setProject(lp1);
			d2.setProject(lp2);
			d3.setProject(lp3);
			
			DepartmentLocationsId dlid1 = new DepartmentLocationsId(1,"Houston");
			DepartmentLocationsId dlid2 = new DepartmentLocationsId(4,"Stafford");
			DepartmentLocationsId dlid3 = new DepartmentLocationsId(5,"Bellaire");
			DepartmentLocationsId dlid4 = new DepartmentLocationsId(5,"Sugarland");
			DepartmentLocationsId dlid5 = new DepartmentLocationsId(5,"Houston");
			
			DepartmentLocations dl1 = new DepartmentLocations(dlid1);
			DepartmentLocations dl2 = new DepartmentLocations(dlid2);
			DepartmentLocations dl3 = new DepartmentLocations(dlid3);
			DepartmentLocations dl4 = new DepartmentLocations(dlid4);
			DepartmentLocations dl5 = new DepartmentLocations(dlid5);
			
			Set<DepartmentLocations> dll1 = new HashSet<DepartmentLocations>();
			dll1.add(dl1);
			
			Set<DepartmentLocations> dll2 = new HashSet<DepartmentLocations>();
			dll2.add(dl2);
			
			Set<DepartmentLocations> dll3 = new HashSet<DepartmentLocations>();
			dll3.add(dl3);
			dll3.add(dl4);
			dll3.add(dl5);
			
			d1.setDepartmentLocations(dll3);
			d2.setDepartmentLocations(dll2);
			d3.setDepartmentLocations(dll1);
			
			session.save(d1);
			session.save(d2);
			session.save(d3);
			
			session.save(dl1);
			session.save(dl2);
			session.save(dl3);
			session.save(dl4);
			session.save(dl5);
			
			DependentId dependentId1 = new DependentId(333445555, "Alice");
			DependentId dependentId2 = new DependentId(333445555, "Theodore");
			DependentId dependentId3 = new DependentId(333445555, "Joy");
			DependentId dependentId4 = new DependentId(987654321, "Abner");
			DependentId dependentId5 = new DependentId(123456789, "Michael");
			DependentId dependentId6 = new DependentId(123456789, "Alice");
			DependentId dependentId7 = new DependentId(123456789, "Elizabeth");
			
			List<Dependent> depl1 = new ArrayList<Dependent>();
			List<Dependent> depl2 = new ArrayList<Dependent>();
			List<Dependent> depl3 = new ArrayList<Dependent>();
			
			date = df.parse("1986-04-05");
			Dependent dep1 = new Dependent('F', date, "Daughter");
			dep1.setDependentId(dependentId1);
			
			date = df.parse("1983-10-25");
			Dependent dep2 = new Dependent('M', date, "Son");
			dep1.setDependentId(dependentId2);
			
			date = df.parse("1958-05-03");
			Dependent dep3 = new Dependent('F', date, "Spouse");
			dep1.setDependentId(dependentId3);
			
			date = df.parse("1942-02-28");
			Dependent dep4 = new Dependent('M', date, "Spouse");
			dep1.setDependentId(dependentId4);
			
			date = df.parse("1988-01-04");
			Dependent dep5 = new Dependent('F', date, "Son");
			dep1.setDependentId(dependentId5);
			
			date = df.parse("1988-12-30");
			Dependent dep6 = new Dependent('F', date, "Daughter");
			dep1.setDependentId(dependentId6);
			
			date = df.parse("1967-05-05");
			Dependent dep7 = new Dependent('F', date, "Spouse");
			dep1.setDependentId(dependentId7);
			
			depl1.add(dep1);
			depl1.add(dep2);
			depl1.add(dep3);
			
			depl2.add(dep4);
			
			depl3.add(dep5);
			depl3.add(dep6);
			depl3.add(dep7);
			
			session.save(dep1);
			session.save(dep2);
			session.save(dep3);
			session.save(dep4);
			session.save(dep5);
			session.save(dep6);
			session.save(dep7);
			
			date = df.parse("1965-01-09");
			Employee e1 = new Employee("John", 'B', "Smith", 123456789, date, "731 Fondren,Houston, TX", 'M', 30000, 333445555);
			e1.setDepartment(d1);
			e1.setDependent(depl3);
			Employee e2 = new Employee("Franklin", 'T', "Wong", 333445555, date, "683 Voss,Houston, TX", 'M', 40000, 888665555);
			e2.setDepartment(d1);
			e2.setDependent(depl1);
			Employee e3 = new Employee("Alicia", 'J', "Zaleya", 999887777, date, "332 Castle,Spring, TX", 'F', 25000, 987654321);	
			e3.setDepartment(d2);
			Employee e4 = new Employee("Jennifer", 'S', "Wallace", 987654321, date, "291 Berry,Houston, TX", 'F', 43000, 888665555);
			e4.setDepartment(d2);
			e4.setDependent(depl2);
			Employee e5 = new Employee("Ramesh", 'K', "Narayan", 666884444, date, "975 Fire Oak,Houston, TX", 'M', 38000, 33344555);
			e5.setDepartment(d1);
			Employee e6 = new Employee("Joyce", 'A', "English", 453453453, date, "563 Rice,Houston, TX", 'F', 25000, 333445555);
			e6.setDepartment(d1);
			Employee e7 = new Employee("Ahmad", 'V', "Jabbar", 987987987, date, "980 Dallas,Houston, TX", 'M', 25000, 987654321);
			e7.setDepartment(d2);
			Employee e8 = new Employee("James", 'E', "Borg", 888665555, date, "450 Stone,Houston, TX", 'M', 55000, 0);
			e8.setDepartment(d3);
			
			WorksOnId woid1 = new WorksOnId(e1.getSsn(), p1.getpNumber());
			WorksOnId woid2 = new WorksOnId(e1.getSsn(), p2.getpNumber());
			WorksOnId woid3 = new WorksOnId(e5.getSsn(), p3.getpNumber());
			WorksOnId woid4 = new WorksOnId(e6.getSsn(), p1.getpNumber());
			WorksOnId woid5 = new WorksOnId(e6.getSsn(), p2.getpNumber());
			WorksOnId woid6 = new WorksOnId(e2.getSsn(), p2.getpNumber());
			WorksOnId woid7 = new WorksOnId(e2.getSsn(), p3.getpNumber());
			WorksOnId woid8 = new WorksOnId(e2.getSsn(), p4.getpNumber());
			WorksOnId woid9 = new WorksOnId(e2.getSsn(), p5.getpNumber());
			
			WorksOn wo1 = new WorksOn(woid1,e1,p1,32.5);
			WorksOn wo2 = new WorksOn(woid2,e1,p2,7.5);
			WorksOn wo3 = new WorksOn(woid3,e5,p3,40.0);
			WorksOn wo4 = new WorksOn(woid4,e6,p1,20.0);
			WorksOn wo5 = new WorksOn(woid5,e6,p2,20.0);
			WorksOn wo6 = new WorksOn(woid6,e2,p2,10.0);
			WorksOn wo7 = new WorksOn(woid7,e2,p3,10.0);
			WorksOn wo8 = new WorksOn(woid8,e2,p4,10.0);
			WorksOn wo9 = new WorksOn(woid9,e2,p5,10.0);
			
			List<WorksOn> worl1 = new ArrayList<WorksOn>();
			List<WorksOn> worl2 = new ArrayList<WorksOn>();
			List<WorksOn> worl3 = new ArrayList<WorksOn>();
			List<WorksOn> worl4 = new ArrayList<WorksOn>();
			
			worl1.add(wo1);
			worl1.add(wo2);
			worl2.add(wo3);
			worl3.add(wo4);
			worl3.add(wo5);
			worl4.add(wo6);
			worl4.add(wo7);
			worl4.add(wo8);
			worl4.add(wo9);
			
			session.save(wo1);
			session.save(wo2);
			session.save(wo3);
			session.save(wo4);
			session.save(wo5);
			session.save(wo6);
			session.save(wo7);
			session.save(wo8);
			session.save(wo9);
			
			e1.setWorksOn(worl1);
			e5.setWorksOn(worl1);
			e6.setWorksOn(worl1);
			e2.setWorksOn(worl1);
			
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.save(e4);
			session.save(e5);
			session.save(e6);
			session.save(e7);
			session.save(e8);
			
			tx.commit();
			
		} catch (Exception e) {
			tx.rollback();
			System.out.println(e);
		}
		
	}

}
