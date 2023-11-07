package exceptions;

/**
 * @author Quentin Rabilloud
 *
 * <i>StructureException</i> is the mother class for DoubleEdgeException.
 *
 */

@SuppressWarnings("serial")
public class StructureException extends PetriNetException {
	
	public StructureException(String msg) {
		super(msg);
	}

}
