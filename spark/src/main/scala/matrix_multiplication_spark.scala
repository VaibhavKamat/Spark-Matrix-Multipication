
package com.disml
import org.apache.spark.mllib.linalg.DenseMatrix

object matrix_multiplication_spark{
	def main(args: Array[String]){

		val random = new scala.util.Random
		def fill_array(dim1: Int, dim2: Int, max: Int): DenseMatrix= {
			new DenseMatrix(dim1, dim2, Array.fill(dim1 * dim2)(random.nextInt(max)))
		}
		
		val executions = 1000
		val n = 1000
		val array_1 = fill_array(n, n, 100)
		val array_2 = fill_array(n, n, 100)

		//var result = array_1.multiply(array_2)
		//println(result)

		val start = System.currentTimeMillis()
		for (_ <- 1 to executions)
			result = array_1.multiply(array_2)
		val end = System.currentTimeMillis()

		average = (end-start)/1000
		println(s"Average time for matrix multiplication is: ${(average)/1000.0} seconds. \n")
		
	}

}

