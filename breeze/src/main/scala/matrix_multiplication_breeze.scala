
import scala.collection.mutable.ArrayBuffer
import breeze.linalg._


object matrix_multiplication_breeze{
	def main (args:Array[String]){
		if (args.length < 5) {
			System.err.println("Usage: MatrixMult <mode> <num_row_dim1> <num_col_dim1> <num_row_dim2> <num_col_dim2>")
			System.exit(1)
		}
		
		val executions = 1000
		val num_row_dim1 = args(1).toInt
		val num_col_dim1 = args(2).toInt
		val array_1 = DenseMatrix.rand[Double](num_row_dim1, num_col_dim1)
	
		val num_row_dim2 = args(3).toInt
		val num_col_dim2 = args(4).toInt
		val array_2 = DenseMatrix.rand[Double](num_row_dim2, num_col_dim2)
	
		val start = System.currentTimeMillis()
		for (_ <- 1 to executions)
			result = array_1 * array_2
		val end = System.currentTimeMillis()
	
		average = (end-start)/executions
		println(s"Average time for matrix multiplication is: ${(average)/1000.0} seconds. \n")
}