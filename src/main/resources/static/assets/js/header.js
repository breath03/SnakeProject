let currentURL = window.location.href;

if(currentURL.includes('messageBoard')) {
  const messageBoardEl = document.querySelector('#messageBoard');
  messageBoardEl.classList.add('active');
} else if(currentURL.includes('information')) {
  const informationEl = document.querySelector('#information');
  informationEl.classList.add('active');
} else {
  const homeEl = document.querySelector('#home');
  homeEl.classList.add('active');
}
