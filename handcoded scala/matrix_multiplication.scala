

object matrix_multiplication{
	def main(args: Array[String]): Unit = {

		val random = new scala.util.Random
		def fill_array(dim1: Int, dim2: Int, max: Int) = Array.fill(dim1, dim2){
			1 + random.nextInt(max)
		}
		
		val executions = 1000
		val n = 1000
		val array_1 = fill_array(n, n, 100)
		val array_2 = fill_array(n, n, 100)
		var result = Array.ofDim[Int](n, n)


		def matrix_multiplication(array_1: Array[Array[Int]], array_2: Array[Array[Int]]) : Unit = {
			
			for (i <- 0 to array_1.length - 1)
				for (j <- 0 to array_2(0).length - 1)
					for (k <- 0 to array_2.length - 1)
						result(i)(j) = result(i)(j) + array_1(i)(k) * array_2(k)(j)
		}
	
		val start = System.currentTimeMillis()
		for (_ <- 1 to executions)
			matrix_multiplication(array_1, array_2)
		val end = System.currentTimeMillis()

        average = (end-start)/executions
		println(s"Average time for matrix multiplication is: ${(average)/1000.0} seconds. \n")

	}

}