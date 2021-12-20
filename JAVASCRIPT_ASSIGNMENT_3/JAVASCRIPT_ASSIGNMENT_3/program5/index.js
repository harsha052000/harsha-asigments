const person = {
    firstName : "harsha",
    lastName : "H T",
    greeting : function(){
        alert('Hi! I\m ' + this.firstName + this.middleName + this.lastName + '.');
    }
};

document.write(person.firstName + " ");
person.middleName = "harsha";
document.write(person.middleName + "  ");
document.write(person.lastName);
console.log(person.greeting());