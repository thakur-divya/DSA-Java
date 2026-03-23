<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Pro YouTube Clone</title>

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<
<body>

<!-- NAVBAR -->
<nav class="navbar navbar-custom px-3 d-flex align-items-center">

    <button class="btn btn-light me-2" id="menuBtn">☰</button>
    <div class="logo">▶ YouTube</div>

    <div class="mx-auto search-box d-flex">
        <input class="form-control" placeholder="Search">
        <button class="btn btn-outline-secondary">🔍</button>
    </div>

    <button class="btn btn-dark ms-2" id="darkBtn">🌙</button>

</nav>

<!-- SIDEBAR -->
<div class="sidebar" id="sidebar">
    <a href="#">🏠 <span>Home</span></a>
    <a href="#">🔥 <span>Trending</span></a>
    <a href="#">📺 <span>Subscriptions</span></a>
    <a href="#">🎵 <span>Music</span></a>
    <a href="#">🎮 <span>Gaming</span></a>
    <a href="#">📰 <span>News</span></a>
    <a href="#">⚙ <span>Settings</span></a>
</div>

<!-- MAIN -->
<div class="main container-fluid" id="main">
    <div class="row" id="videos"></div>
</div>

<script>
// Generate sample videos
const container = document.getElementById("videos");

for(let i=1;i<=20;i++){
container.innerHTML += `
<div class="col-lg-3 col-md-4 col-sm-6">
    <div class="video-card">
        <div class="thumbnail"></div>
        <div class="video-info">
            <div class="video-title">Pro YouTube Video Title ${i}</div>
            <div class="channel">Channel Name</div>
            <div class="meta">25K views • 2 days ago</div>
        </div>
    </div>
</div>`;
}

// Sidebar toggle
const menuBtn = document.getElementById("menuBtn");
const sidebar = document.getElementById("sidebar");
const main = document.getElementById("main");

menuBtn.onclick = () =>{
    sidebar.classList.toggle("collapsed");
    main.classList.toggle("expand");
}

// Dark mode
document.getElementById("darkBtn").onclick = ()=>{
    document.body.classList.toggle("dark");
}
</script>

</body>
</html>
