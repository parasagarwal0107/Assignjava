package pack;

/*
 * Custom Exception taken for leaves if exceeded
 */
class MoreThan15Leave extends Exception {

	MoreThan15Leave(String s) {
		super(s);
	}
}