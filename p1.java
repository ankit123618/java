// Java program to multiply two square matrices.
java.io.®;
class GFG {

// Function to print Matrix
static void printMatrix(int M[][],

int rowSize,
int colSize)
{
for (inti =0;i<rowSize; i++) {
for (intj = 0; j < colSize; j++)
System.out.print(M[i][j] +" ");
System.out.printin(};
}
1

// Function to multiply
// two matrices A[l[] and B[][]
static void multiplyMatrix(
int row1, int coll, int A[][],
int row2, int col2, int B[][1)

inti, j, k;

// Print the matrices A and B
System.out.printin("\nMatrix A:"};
printMatrix(A, rowl, coll);
System.out.printin("\nMatrix B:");
printMatrix(B, row2, col2);

// Check if multiplication is Possible
if (row2 != coll) {

System, out.printin(
"\nMultiplication Not Possible");
return;

Ignou Study Helper-Sunil Poonia Page 1
www.ignousite.com fi 542 Joke nay HELPER

} ems SUNIL Poona

// Matrix to store the result
// The product matrix will

// be of size row1 x col2

int C[}{] = new int[row1][col2];

// Multiply the two matrices
for (i= 0; i < rowl; i++) {
for (j=0;j<col2; j++) {
for (k=0; k < row2; k++)
CLM] += ALTIK] * BLK];

0)

[—

Card: TOW
// Print the result wef

System.out.printin("\nResultant Matrix:");
printMatrix(C, rowl, col);

// Driver code
public static void main(String[] args)

{
int rowl=4, coll =3, row2 = 3, cold = 4;
intAlll={{1,1,1}
{2.2.2}
{3,33}
{4,4,4});
int BlJ[1={{1,1,1,1},
{2,2,2,2}
{3,3,.3,3}k
multiplyMatrix(row1, coll, A,
row2, col2, B);
]
}