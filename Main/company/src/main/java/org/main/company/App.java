package org.main.company;

import org.main.company.service.CompanyServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CompanyServiceImpl cs = new CompanyServiceImpl();
        cs.openSession();
    }
}
