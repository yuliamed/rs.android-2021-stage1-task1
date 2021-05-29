package subtask2

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum = 0
        sum = bill.sum() - bill[k]
        var sumAnn = sum / 2
        if (sumAnn == b) return "Bon Appetit"
        else return (b - sumAnn).toString()
    }
}
