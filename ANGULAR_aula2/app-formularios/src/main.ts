import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { CadastroComponent } from './app/cadastro/cadastro.component';

bootstrapApplication(CadastroComponent, appConfig)
  .catch((err) => console.error(err));
