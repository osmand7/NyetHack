package com.example.nyethack

fun main() {
    val name = "Magrial"
    var healthpoints = 89
    val isBlessed = true
    val isImmortal = false

    //Aura
    val auraColor = auraColor(isBlessed, healthpoints, isImmortal)

    val healthStatus = formatHealthStatus(healthpoints, isBlessed)


    //Player status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    //Drunk
    castFireBall()



}
private fun formatHealthStatus(healthpoints: Int, isBlessed: Boolean)=
    when (healthpoints) {
        100 -> "is in excellent  condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }


private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println(
        "(Aura: $auraColor)" +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})"
    )
    println("$name $healthStatus")
}

private fun auraColor(
    isBlessed: Boolean,
    healthpoints: Int,
    isImmortal: Boolean
): String {
    val auraColor = if (isBlessed && healthpoints > 50 || isImmortal) "GREEN" else "NONE"
    return auraColor
}
private fun castFireBall(numFireBalls:Int = 2 ) =
    println("A glass of FireBall springs in existence.(x$numFireBalls)")

