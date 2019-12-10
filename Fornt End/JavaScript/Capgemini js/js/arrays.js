// var x =[12345,'abcd', true, {name:'Asad'}];

// console.log(x[0]);

// for(var i = 0; i< x.length; i++)
// {
//     console.log(x[i]);
// }

var colors = ['yellow', 'blue', 'purple', 'white']
console.log(colors);
colors.pop();
console.log(colors);
colors.push('voilet', 'green');
console.log(colors);
colors.shift();
console.log(colors);
colors.unshift('black', 'grey');
console.log(colors);
colors.splice(2, 2);
console.log(colors);
colors.splice(2, 1, 'indigo', 'orange', 'indian black');
console.log(colors);

//callback concept
function test(cb) {
    console.log('test function started');
    cb();
    console.log('test function ended');
}

test(function () {
    console.log('callback fuction is being executed')
});

setTimeout(function () {
    console.log('10 seconds done');
}, 10000);

// var i = 1;
// setInterval(function() {
//     console.log(i);
//     i++;
// }, 1);
colors.forEach(function (value, index, array) {
    console.log(value, index, array);
});


var myArray = [1, 2, 3, 4, 5, 6, 1, 2, 2, 3, 4, 5, 8, 7, 6];

var x = myArray.filter(function (value) {
    return value > 3;
});
console.log(x);



var filteredArray = myArray.filter(function (value, index, array) {
    return array.indexOf(value) === index;
});
console.log(filteredArray);

if (123 == '123') {
    console.log('true');
} else {
    console.log('false');
}
if (123 === '123') {
    console.log('true');
} else {
    console.log('false');
}

for (var x of myArray) {
    console.log(x);
}

for (var index in colors) {
    console.log("the value is " + colors[index] + " and the index is " + index)
}

var movie = {
    name: 'dookudu',
    actor: 'mahesh',
    actress: 'samantha',
    director: 'puri jaganaath'
};
for (var key in movie) {
    console.log(key, movie[key]);
}