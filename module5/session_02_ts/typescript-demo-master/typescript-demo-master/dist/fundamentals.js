function main1() {
    console.log("START");
    if (true) {
        var lang = "vi";
        var target = "en-us";
        console.log("inside block");
        console.log(target);
    }
    console.log(lang);
    console.log(target);
}
function main2() {
    var x = 5;
    console.log(x);
    var x = 10;
    console.log(x);
    var a = 55;
    console.log(a);
    var y = 100;
    console.log(y);
}
function main3() {
    console.log(x);
    var x = 5;
    console.log(y);
    var y = 10;
}
function main4() {
    var message;
    var total = 100;
    var isProduction = true;
    var prices = [120, 88, 60];
    var languages = ['vi', 'en-us'];
    var now = new Date();
    var unknown;
    var Direction;
    (function (Direction) {
        Direction[Direction["UP"] = 0] = "UP";
        Direction[Direction["DOWN"] = 1] = "DOWN";
        Direction[Direction["LEFT"] = 2] = "LEFT";
        Direction[Direction["RIGHT"] = 3] = "RIGHT";
    })(Direction || (Direction = {}));
    ;
    function log(msg) {
        console.log(msg);
    }
    isProduction = false;
    unknown = Direction.UP;
    unknown = 'changed';
    var post = {
        id: "", title: ""
    };
    function getPost(postId) {
        return {
            id: postId,
            title: 'Post Title',
            body: 'Post Body',
            extra: 'data'
        };
    }
}
function main() { }
main();
//# sourceMappingURL=fundamentals.js.map