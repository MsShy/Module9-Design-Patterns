package homework.builder;

public class Profile {
	private final String field1;
	private final String field2;
	private final String field3;
	private final String field4;

	private Profile(final Builder builder) {
		field1 = builder.field1;
		field2 = builder.field2;
		field3 = builder.field3;
		field4 = builder.field4;
	}

	@Override
	public String toString() {
		return "Profile{" +
				"field1='" + field1 + '\'' +
				", field2='" + field2 + '\'' +
				", field3='" + field3 + '\'' +
				", field4='" + field4 + '\'' +
				'}';
	}

	public static class Builder {
		private String field1;
		private String field2;
		private String field3;
		private String field4;

		public Builder() {
		}

		public Builder field1(String field1) {
			this.field1 = field1;
			return this;
		}

		public Builder field2(String field2) {
			this.field2 = field2;
			return this;
		}

		public Builder field3(String field3) {
			this.field3 = field3;
			return this;
		}

		public Builder field4(String field4) {
			this.field4 = field4;
			return this;
		}

		public Profile build() {
			return new Profile(this);
		}
	}
}
