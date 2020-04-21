import kotlin.math.pow

fun main() {
	println(bmiWhoCategory(175.0, 150.0))
}

// Body Mass Index World Health Organization Category
fun bmiWhoCategory(heightCm: Double, weightKg: Double): String {
	val bmi = weightKg / (heightCm / 100).pow(2)
	return when {
		bmi < 15 -> "Very severely underweight"
		bmi < 16 -> "Severely underweight"
		bmi < 18.5 -> "Underweight"
		bmi < 25 -> "Normal (healthy weight)"
		bmi < 30 -> "Overweight"
		bmi < 35 -> "Obese Class I (Moderately obese)"
		bmi < 40 -> "Obese Class II (Severely obese)"
		else -> "Anomaly"
	}
}