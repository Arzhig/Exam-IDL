package org.pneditor.petrinet.models.BAD4Debug;

import java.util.Vector;

public class Test2Debug {
	public static void main(String[] args) {
		count2();
	}

	/**
	 *  P_1:4 --2-> T_0 --1-> P_2:0
	 */
	public static void pn1P1T() {
		PetriNetInterface pn = new PetriNet();
		Place p1 = pn.addPlace(1);
		p1.addTokens(3);
		Transition t1 = pn.addTransition();
		pn.addPlace2TransitionArc(p1, t1, 2);
		Place p2 = pn.addPlace(0);
		pn.addTransition2PlaceArc(t1, p2, 1);
		System.out.println(" Description de pn \n" + pn);
		System.out.println(" t1.isTriggerable() " + t1.isTriggerable());
		System.out.println(" pn.trigger(t1); -----> ");
		pn.trigger(t1);
		System.out.println(" p1.getTokens() == 2 " + (p1.getTokens() == 2));
		System.out.println(" p2.getTokens() == 1 " + (p2.getTokens() == 1));
		System.out.println(" pn.trigger(t1);  -----> ");
		pn.trigger(t1);
		System.out.println(" p1.getTokens() == 0 " + (p1.getTokens() == 0));
		System.out.println(" p2.getTokens() == 2 " + (p2.getTokens() == 2));		
		System.out.println(" Description de pn \n" + pn);
	}
	
	/**
	 *  P_0:1 --1-> T_0 --2-> P_1
	 *  P_1:  --1-> T_1 --2-> P_0
	 */
	// TODO possible for main test
	public static void count2() {
		PetriNetInterface pnl = new PetriNet();
		Place p0 = pnl.addPlace(1);
		Place p1 = pnl.addPlace(0);
		Transition t0 = pnl.addTransition();
		Transition t1 = pnl.addTransition();
		pnl.addPlace2TransitionArc(p0, t0, 1);
		pnl.addTransition2PlaceArc(t0, p1, 2);
		pnl.addPlace2TransitionArc(p1, t1, 1);
		pnl.addTransition2PlaceArc(t1, p0, 2);
//		System.out.println(" Description de pn \n" + pnl);
//		System.out.println(" t1.isTriggerable() " + t0.isTriggerable());
//		System.out.println(" pn.trigger(t0); -----> ");
//		pnl.trigger(t0);
//		//System.out.println(" p0.getTokens() == 2 " + (p0.getTokens() == 2));
//		System.out.println(" pnl.trigger(t0);  -----> ");
//		pnl.trigger(t1);
//		//System.out.println(" p0.getTokens() == 3 " + (p0.getTokens() == 3));
//		System.out.println(" Description de pn \n" + pnl);
		
		// test simulate
		Vector<Integer> cfg = new Vector<Integer>();
		cfg.add(0);
		pnl.simulate(cfg); 
	}

}