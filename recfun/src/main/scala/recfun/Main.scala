package recfun
import scala.collection.mutable.Stack
import scala.collection.mutable.HashMap 
import scala.collection.mutable.Set 


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {if (c==0 || c==r) 1 else {pascal(c, r-1) + pascal(c-1, r-1)	}  }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

				var s = Stack[Char]()
				for (term <- chars) {
						if (term=='(' || term == ')') {
							if (s.isEmpty) {
									s.push(term)}
									else {
								val temp = s.pop()
								if (temp >= term) {
										s.push(temp);
										s.push(term)}
							}
						}
				}

				s.isEmpty
	}
	  
  /**
   * Exercise 3
   */
//    def stairsteps(money: Int, coins: List[Int]): Int = {
//		println(s"money is $money, coins is $coins")
//		var i:Int = 1
//		var a = scala.collection.mutable.HashMap[Int, Int](0 ->1)
//		while (i<=money){
//				println(s"$i, $money, $a")
//				var temp = Array[Int]()
//				for (term <-  coins){
//					if (term <= i){
//						temp = temp :+ a(i-term)
//					}
//				}
//				a += (i -> temp.sum)
//				i=i+1
//		}
//	a(money)


//	}
//    def distinct_pathlengths(money: Int, coins: List[Int]): Int = {
//		println(s"money is $money, coins is $coins")
//		var i:Int = 1
//		var pathlengths = HashMap[Int, Set[Int]](0 -> Set(0))
//		while (i<=money){
				//println(s"$i, $money, $pathlengths")
//				pathlengths += (i -> coins.filter(x=> x<=i).map(x=> i-x).map(x=>pathlengths(x)).foldLeft(Set[Int]())( (x:Set[Int], y:Set[Int]) => x.union(y.map(i => i+1))))
//				i=i+1
//		}
				//println(s"$i, $money, $pathlengths")
//	pathlengths(money).toList.length




//	}

	def countChange(money: Int, coins: List[Int]): Int = {
		if (coins.isEmpty || money < 0) return 0 else {
			if (money==0) return 1 else{
				return countChange(money, coins.tail) + countChange(money-coins.head, coins)
			}
		}

}

}
