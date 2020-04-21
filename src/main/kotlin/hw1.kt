fun main() {
	val amount = 200
	val totalSpent = 11000
	println(getFee(amount, totalSpent))
}

fun getFee(amount: Int, totalSpent: Int, lightFee: Boolean = false): Int {
	val fee = when {
		totalSpent <= 1000 -> 0.3
		totalSpent <= 5000 -> 0.25
		totalSpent <= 10000 -> 0.2
		else -> 0.15
	} - if (lightFee) 0.05 else 0.0
	return (fee * amount).toInt()
}