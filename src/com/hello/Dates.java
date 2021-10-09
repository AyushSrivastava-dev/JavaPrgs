package com.hello;
import java.util.*;
public class Dates {
	int dd, mm;
	Dates(int nd, int nm){
		dd = nd;
		mm = nm;
	}
	int dateToDaysNumber() {
		int a[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int td = 0;
	    for(int i = 1; i<mm; i++) {
	    	td = td+a[i];
	    }
	    	td = td+dd;
	    	return td;
	    }

	Dates dateNumToDate(int dn) {
		Dates dt = new Dates(0,0);
		int a[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int td = 0;
        while(td<dn)
        	td = td+a[++dt.mm];
        dt.dd = dn-(td-a[dt.mm]);
        return dt;
		
	}
	Dates futureDate(int n) {
		Dates fd = new Dates(0,0);
		int t = dateToDaysNumber()+n;
		fd = dateNumToDate(t);
		return fd;
	}

	void display() {
		System.out.println(dd+"-"+mm);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current date");
		int d = sc.nextInt();
		int m = sc.nextInt();
		Dates cd = new Dates(d,m);
		System.out.println("Enter the days to be added");
		int n = sc.nextInt();
		Dates fd = cd.futureDate(n);
		System.out.println("Current Date = ");
		cd.display();
		System.out.println("project and date");
		fd.display();
		sc.close();
		}
}
