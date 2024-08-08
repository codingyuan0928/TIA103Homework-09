package hw8;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	// constructor
	public Train() {

	}

	public Train(int number, String type, String start, String dest, Double price) {
		this.setNumber(number);
		this.setType(type);
		this.setStart(start);
		this.setDest(dest);
		this.setPrice(price);
	}

	// getter/setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// override for sort methods and TreeSet
	public int compareTo(Train train) {
		if (this.number < train.number) {
			return 1;
		} else if (this.number == train.number) {
			return 0;
		} else {
			return -1;
		}
	}

	// override for HashSet
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + (type == null ? 0 : type.hashCode());
		result = result * prime + (start == null ? 0 : start.hashCode());
		result = result * prime + (dest == null ? 0 : dest.hashCode());
		result = result * prime + (int) price;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && this.getClass() == obj.getClass()) {
			Train t = (Train) obj;
			if (this.number == t.number && this.type.equals(t.type) && this.start.equals(t.start)
					&& this.dest.equals(t.dest) && this.price == t.price) {
				return true;
			}
		}
		return false;
	}
}
