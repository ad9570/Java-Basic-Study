class Ex14Wrapper {
	public static void main(String[] args) {
		Integer i  = new Integer(100);
		Integer io = new Integer(100);

		System.out.println("(i == io) = " + (i == io));
		System.out.println("i.equals(io) = " + i.equals(io));
		System.out.println("i.compareTo(io) = " + i.compareTo(io));
		System.out.println("i.toString() = " + i);

		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + "bits");
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}
}