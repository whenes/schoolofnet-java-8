var String = Java.type("java.lang.String");

function greetings(name) {
    var result = "Welcome to nashorn " + name;
    return result;
}

print(greetings("Will"));