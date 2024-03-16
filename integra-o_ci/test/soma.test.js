const soma = require('../src/soma');

test('adicione 1 + 2 para ser igual a 3', () => {
  expect(soma(1, 2)).toBe(3);
});