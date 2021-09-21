package confidential.polynomial;

public enum PolynomialCreationReason {
    RANDOM,
    RECOVERY,
    RESHARING;

    private static final PolynomialCreationReason[] values = values();

    public static PolynomialCreationReason getReason(int ordinal) {
        return values[ordinal];
    }
}
