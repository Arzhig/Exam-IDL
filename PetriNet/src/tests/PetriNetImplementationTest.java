package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exceptions.BadEntryException;
import exceptions.DoubleEdgeException;
import exceptions.IncorrectEdgeException;
import items.Place;
import items.Transition;
import junit.framework.AssertionFailedError;
import packnp.PetriNetImplementation;

class PetriNetImplementationTest {

	@Test
	void testPetriNetImplementation() {
		System.out.println("Testing  initialisation  of a brand new PetriNet");
		try {
			// A brand new PetriNet should contain no item
			PetriNetImplementation net = new PetriNetImplementation();
			if (net.getPlaces().size()!=0) {
				System.out.println("Err 1.1 : Non-zero number of places in newly created network");
				System.exit(1);
			}
			if (net.getTransitions().size()!=0) {
				System.out.println("Err 1.1 : Non-zero number of transitions in newly created network");
				System.exit(1);
			}	
		}
		catch (Exception e) {
		    System.out.println("Unexpected exception : " + e);
		    e.printStackTrace();
		}
	}

	@Test
	void testGetPlaces() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPlace() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTransitions() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTransition() {
		fail("Not yet implemented");
	}

	@Test
	void testAddPlace() {
		
		System.out.println("Testing addition of places in a PetriNet");
		
		PetriNetImplementation net = new PetriNetImplementation();
		
		try {
			Place p1 = new Place(3);
			net.add(p1);
			Assertions.assertEquals(net.getPlace(0), p1);
		}
		catch (AssertionFailedError e) {
			System.out.println("The place created and the place added are different");
		}
		catch (BadEntryException e) {
			System.out.println("The place created was given incorrect arguments");
		}
		catch (Exception e) {
			System.out.println("Err x : exception not handled : " + e);
		    e.printStackTrace();
		}
		
	}

	@Test
	void testAddTransition() {
		System.out.println("Testing addition of transitions in a PetriNet");
		
		PetriNetImplementation net = new PetriNetImplementation();
		
		try {
			Transition t1 = new Transition();
			net.add(t1);
			Assertions.assertEquals(net.getTransition(0), t1);
		}
		catch (AssertionFailedError e) {
			System.out.println("The transition created and the transition added are different");
		}
		catch (Exception e) {
			System.out.println("Err x : exception not handled : " + e);
		    e.printStackTrace();
		}
	}

	@Test
	void testAddEdgeOut() {
		fail("Not yet implemented");
	}

	@Test
	void testAddEdgeZero() {
		fail("Not yet implemented");
	}

	@Test
	void testAddEdgeEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testAddEdgeIn() {
		fail("Not yet implemented");
	}

	@Test
	void testStep() {
		fail("Not yet implemented");
	}

	@Test
	void testRemovePlace() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveTransition() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveEdgeOut() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveEdgeIn() {
		fail("Not yet implemented");
	}

}
