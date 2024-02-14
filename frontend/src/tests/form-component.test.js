import { fixture, html } from '@open-wc/testing';
import '../components/form-component';

describe('Form component test',  () => {
    it('renders correctly', async () => {
      const form = await fixture(html`<form-component></form-component>`);
      expect(form).to.not.be.undefined;
    });
});
