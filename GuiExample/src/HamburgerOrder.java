public class HamburgerOrder {

	private boolean lettace;
	private boolean tomato;
	private boolean onion;
	private boolean halfPound;
	private boolean combo;

	public HamburgerOrder() {
		lettace = false;
		tomato = false;
		onion = false;
		halfPound = false;
		combo = false;
	}

	public double getPrice() {
		double price = 0;
		if (halfPound) {
			price += 4;
		} else {
			price += 3.25;
		}

		if (combo) {
			price += 1.5;
		}

		return price;
	}

	public boolean isLettace() {
		return lettace;
	}

	public void setLettace(boolean lettace) {
		this.lettace = lettace;
	}

	public boolean isTomato() {
		return tomato;
	}

	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}

	public boolean isOnion() {
		return onion;
	}

	public void setOnion(boolean onion) {
		this.onion = onion;
	}

	public boolean isCombo() {
		return combo;
	}

	public void setCombo(boolean combo) {
		this.combo = combo;
	}

	public boolean isHalfPound() {
		return halfPound;
	}

	public void setHalfPound(boolean halfPound) {
		this.halfPound = halfPound;
	}

	@Override
	public String toString() {
		return "HamburgerOrder [lettace=" + lettace + ", tomato=" + tomato + ", onion=" + onion + ", halfPound="
				+ halfPound + ", combo=" + combo + "]";
	}

}
