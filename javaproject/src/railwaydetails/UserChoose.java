package railwaydetails;

import java.util.Random;

import javaproject.Compartment;
import javaproject.FirstClass;
import javaproject.GeneralCompartment;
import javaproject.LadiesCompartment;

public class UserChoose {

	public static void main(String[] args) {
		int n=7;
		while(n>0)
		{
		getObject().notice();
		n--;
		}

		}

		static Compartment getObject()
		{
		Object[] object = {new FirstClass(),new LadiesCompartment(),new GeneralCompartment(),new Luggage()};
		Random random = new Random();
		return (Compartment) object[random.nextInt(3)];

		}

	}


