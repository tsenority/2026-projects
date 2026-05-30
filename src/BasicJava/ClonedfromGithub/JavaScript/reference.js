//primitive values
let language = "Python"; // with let, we can reassign a value. not with the const.
let oldlanguage = language;
language = "JavaScript";

console.log(language);
console.log(oldlanguage);


//Object
const development = {
    frontend: "JavaScript",
    backend: "Java",
};

const newDevelopment = development;// new development object created but both points to the
                                   //same development object.
console.log(ewDevelopment);

development.fullstack = "Python";// can add python in development.
console.log(development);
delete development.fullstack = "Python";//deletes the python

