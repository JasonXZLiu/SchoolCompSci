var amp1 = 1;
var per1 = 1;
var shift1 = 1;
var amp2 = 1;
var per2 = 1;
var shift2 = 1;
var canvas, ctx;

function fun1(x) {return amp1 * Math.sin(per1 * (x + shift1));}
function fun2(x) {return amp2 * Math.cos(per2 * (x + shift2));}
function fun3(x) {return fun1(x)+fun2(x);}

function redraw() {
    if($(".amp1").val() == null || $(".amp1").val() == "") amp1 = 1;
    else amp1 = $(".amp1").val();
    if($(".per1").val() == null|| $(".per1").val() == "") per1 = 1;
    else per1 = $(".per1").val();
    if($(".shift1").val() == null|| $(".shift1").val() == "") shift1 = 1;
    else shift1 = $(".shift1").val();
    if($(".amp2").val() == null || $(".amp2").val() == "") amp2 = 1;
    else amp2 = $(".amp2").val();
    if($(".per2").val() == null|| $(".per2").val() == "") per2 = 1;
    else per2 = $(".per2").val();
    if($(".shift2").val() == null|| $(".shift2").val() == "") shift2 = 1;
    else shift2 = $(".shift2").val();
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    draw();
}

function draw() {
    canvas = document.getElementById("canvas");
    if (null==canvas || !canvas.getContext) return;

    var axes={};
    ctx=canvas.getContext("2d");
    axes.x0 = .5 + .5*canvas.width; 
    axes.y0 = .5 + .5*canvas.height; 
    axes.scale = 100;      
    axes.doNegativeX = true;

    displayAxes(ctx,axes);
    funcGraph(ctx,axes,fun1,"rgb(76,185,68)",1); 
    funcGraph(ctx,axes,fun2,"rgb(36,110,185)",1);
    funcGraph(ctx,axes,fun3,"rgb(168,32,26)",5); 
}

function funcGraph (ctx,axes,func,color,thick) {
    var xx, yy, dx=4, x0=axes.x0, y0=axes.y0, scale=axes.scale;
    var iMax = Math.round((ctx.canvas.width-x0)/dx);
    var iMin = axes.doNegativeX ? Math.round(-x0/dx) : 0;
    ctx.beginPath();
    ctx.lineWidth = thick;
    ctx.strokeStyle = color;

    for (var i=iMin;i<=iMax;i++) {
        xx = dx*i; yy = scale*func(xx/scale);
        if (i==iMin) ctx.moveTo(x0+xx,y0-yy);
        else         ctx.lineTo(x0+xx,y0-yy);
    }
    ctx.stroke();
}

function displayAxes(ctx,axes) {
    var x0=axes.x0, w=ctx.canvas.width;
    var y0=axes.y0, h=ctx.canvas.height;
    var xmin = axes.doNegativeX ? 0 : x0;
    ctx.beginPath();
    ctx.strokeStyle = "rgb(128,128,128)"; 
    ctx.moveTo(xmin,y0); ctx.lineTo(w,y0); 
    ctx.moveTo(x0,0);    ctx.lineTo(x0,h);  
    ctx.stroke();
}