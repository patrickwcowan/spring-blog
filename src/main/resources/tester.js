// function findSum(n) {
//     var i = 1;
//     var output = 0;
//     do {
//         if (i % 3 === 0 || i % 5 === 0) {
//             output = output + i;}
//         i++;
//     } while (i <= n);
//     return output;
// }


// function findSum(n){
//     var output = 0;
//     for (var i = 0; i <= n; i++){
//         if (i % 3 === 0 || i % 5 === 0){output = output + i;}
//     }return output;
// }
//
// console.log(findSum(10));

// var input = [1,2,3,4,10,11];
//
// function simpleArraySum(ar) {
//     var output = 0;
//     for (var i = 0; i < input.length; i++) {
//         output+=ar[i];
//     }
//     return output;
// }
//
// console.log(simpleArraySum(input));

function solution(str, ending) {
    var first = "";
    var second = "";
    for (var i = 1; i < ending.length;i--){
        first+=str[i];
    }
    console.log(first);
}

console.log(solution('abc', 'bv'));