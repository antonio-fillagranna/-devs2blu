import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { DiretivasComponent } from './app/diretivas/diretivas.component';

bootstrapApplication(DiretivasComponent, appConfig)
  .catch((err) => console.error(err));
