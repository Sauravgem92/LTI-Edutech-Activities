function read() {
  var content = document.getElementById("content");
  var moreText = document.getElementById("extra");
  var anchor = document.getElementById("anchor");

  if (moreText.style.display === "none") {
    moreText.style.display = "inline";
    anchor.innerHTML = "less";
    content.appendChild(moreText);
  } else {
    moreText.style.display = "none";
    anchor.innerHTML = "more";
  }
}
