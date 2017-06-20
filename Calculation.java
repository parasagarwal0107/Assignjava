package pack;

abstract class Calculation implements Calc {

	/*
	 * Abstract class for implementing the interface.
	 */
	abstract void countLeaves(int leaves) throws MoreThan15Leave;// count leaves

}