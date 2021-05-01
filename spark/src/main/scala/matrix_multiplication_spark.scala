
import org.apache.spark.mllib.linalg.DenseMatrix

object matrix_multiplication_spark{
	def main(args: Array[String]){

		val random = new scala.util.Random
		def fill_array(dim1: Int, dim2: Int, max: Int): DenseMatrix= {
			new DenseMatrix(dim1, dim2, Array.fill(dim1 * dim2)(random.nextInt(max)))
		}
		
		val executions = 1000
		val mat_A_num_rows = args(0).toInt
        	val mat_A_num_cols = args(1).toInt
        	val mat_B_num_rows = args(2).toInt
        	val mat_B_num_cols = args(3).toInt

        	val mat_A = fill_array(mat_A_num_rows, mat_A_num_cols, 100)
        	val mat_B = fill_array(mat_B_num_rows, mat_B_num_cols, 100)
		
		val start = System.currentTimeMillis()
		for (_ <- 1 to executions)
			val result = array_1.multiply(array_2)
		val end = System.currentTimeMillis()

		val average = (end-start)/1000
		println(s"Average time for matrix multiplication is: ${(average)/1000.0} seconds. \n")
		
	}

}

