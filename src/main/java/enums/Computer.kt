package enums

enum class Computer(val numberOfProcessors: Int, val ramSize: Int) {
    HP(2, 4), DELL(8, 8),
    MAC(8, 16)

    /**
     * if you define any methods in the enum class,
     * the semicolon separates the enum constant list from
     * the method definitions.
     * **/

}