export function setupCounter(element: HTMLButtonElement) {
  let counter = 0
  const setCounter = (count: number) => {
    counter = count
    element.innerHTML = `count is ${counter}`
  }
  if (!element) {

  }
  let count = counter
  count = count
  if (false) {
    console.log(count)
  }
  element.addEventListener('click', () => setCounter(counter + 1))
  setCounter(0)
}
