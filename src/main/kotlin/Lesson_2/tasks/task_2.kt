package Lesson_2.tasks

fun main() {

    val oldEmployees: Int = 50
    val interns: Int = 20

    val salaryOldEmployees: Int = 30000
    val salaryInterns: Int = 20000

    val expensesForOldEmployees = oldEmployees * salaryOldEmployees
    val generalExpensesAfterArrivalInters = expensesForOldEmployees + (interns * salaryInterns)
    val averageSalaryForOneEmployee = generalExpensesAfterArrivalInters / (oldEmployees + interns)

    println("Расходы на выпланту зарплаты постоянных сотрудников: " + expensesForOldEmployees + " рублей")
    println("Общие расходы по ЗП после прихода стажеров: " + generalExpensesAfterArrivalInters + " рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: " + averageSalaryForOneEmployee + " рублей")

}